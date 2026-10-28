package e2;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import bi.ce;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import di.s6;
import di.s8;
import fi.a7;
import fi.ac;
import fi.e6;
import fi.f8;
import fi.l2;
import fi.n9;
import fi.o6;
import fi.o7;
import fi.q2;
import fi.q6;
import fi.s1;
import fi.u1;
import fi.w7;
import fi.z6;
import fi.zb;
import hi.m3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.ds;
import sg.c2;
public final class q0 implements Runnable {
    public final int f9709a;
    public final Object f9710b;
    public final Object f9711c;

    public q0(int i10, Object obj, Object obj2) {
        this.f9709a = i10;
        this.f9710b = obj;
        this.f9711c = obj2;
    }

    @Override
    public final void run() {
        PowerManager.WakeLock wakeLock;
        float f7;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i10 = 0;
        switch (this.f9709a) {
            case 0:
                n4.s sVar = (n4.s) this.f9710b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f9711c;
                synchronized (sVar) {
                    if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) sVar.f18696c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 1:
                ea.c cVar = (ea.c) this.f9710b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f9711c;
                try {
                    m5.t.a().d.e(cVar.h.f18351a.b(j5.d.f15514c), 1);
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 2:
                ei.v vVar = (ei.v) this.f9710b;
                String str = (String) this.f9711c;
                ArrayList arrayList = vVar.f10017f;
                while (true) {
                    if (i10 < arrayList.size()) {
                        if (!TextUtils.equals(((s6) arrayList.get(i10)).E, str)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    vVar.f10019r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 3:
                fi.d dVar = (fi.d) this.f9710b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f9711c;
                int i11 = dVar.I - 1;
                dVar.I = i11;
                dVar.b(i11, true);
                if (dVar.I > 0) {
                    AndroidUtilities.runOnUIThread(dVar.J, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 4:
                ((Utilities.Callback) this.f9710b).run((ArrayList) this.f9711c);
                return;
            case 5:
                s1 s1Var = (s1) this.f9710b;
                TLObject tLObject = (TLObject) this.f9711c;
                u1 u1Var = s1Var.f11577s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    l2 l2Var = u1Var.f11745r;
                    MessagesController.getInstance(l2.D(l2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(l2.F(l2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(l2.H(l2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                s1Var.f11575n = true;
                s1Var.G();
                return;
            case 6:
                ((q2) this.f9710b).e(0.0f, 240L, (Runnable) this.f9711c);
                return;
            case 7:
                e6 e6Var = (e6) this.f9710b;
                View view = (View) this.f9711c;
                e6Var.getClass();
                if (view instanceof sg.j) {
                    sg.j jVar = (sg.j) view;
                    jVar.m();
                    e6Var.A0(jVar, true);
                    return;
                }
                return;
            case 8:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f9710b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f9711c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 9:
                ((Utilities.Callback) this.f9710b).run((Bitmap) this.f9711c);
                return;
            case 10:
                o6.a((o6) this.f9710b, (w7) this.f9711c);
                return;
            case 11:
                w7 w7Var = (w7) this.f9711c;
                o6 o6Var = (o6) ((a8.h0) this.f9710b).d;
                Bitmap bitmap = o6Var.f11360a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (w7Var.M0 == o6Var.f11360a) {
                        w7Var.M0 = null;
                    }
                    o6Var.f11360a = null;
                    o6Var.invalidate();
                    return;
                }
                return;
            case 12:
                fi.s6 s6Var = (fi.s6) this.f9710b;
                AtomicReference atomicReference = s6Var.f11587a;
                ?? obj = new Object();
                obj.f7500a = 256;
                atomicReference.set(new s8.n(new t2((Context) this.f9711c, (x1) obj)));
                s6Var.a(s6Var.f11590f);
                return;
            case 13:
                ((fi.s6) this.f9710b).f11589c.run((q6) this.f9711c);
                return;
            case 14:
                fi.p pVar = (fi.p) this.f9710b;
                c2 c2Var = (c2) this.f9711c;
                a7 a7Var = pVar.f10565a;
                if (c2Var.getWidth() <= 0) {
                    a7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new s8(pVar, 24)).start();
                    return;
                }
                float width = c2Var.getWidth() / a7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f10572w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f10572w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f10572w.addUpdateListener(new z6(pVar, a7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((a7Var.getWidth() / 2.0f) + a7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((a7Var.getHeight() / 2.0f) + a7Var.getY()), 0));
                pVar.f10572w.addListener(new ce(5, pVar, c2Var));
                pVar.f10572w.setDuration(320L);
                pVar.f10572w.setInterpolator(ds.h);
                pVar.v = c2Var;
                pVar.f10572w.start();
                return;
            case 15:
                o7.T((o7) this.f9710b, (TLObject) this.f9711c);
                return;
            case 16:
                o7 o7Var = (o7) this.f9710b;
                o7Var.K0 = false;
                o7Var.f11396b0.addAll((ArrayList) this.f9711c);
                o7Var.f11409p0.O(true);
                return;
            case 17:
                w7 w7Var2 = (w7) this.f9710b;
                TLObject tLObject2 = (TLObject) this.f9711c;
                w7Var2.f11899e1 = 0;
                if (tLObject2 instanceof Vector) {
                    w7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.f22040id = document.f22034id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            w7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 18:
                f8.R((f8) this.f9710b, (TLObject) this.f9711c);
                return;
            case 19:
                f8 f8Var = (f8) this.f9710b;
                TextView textView = (TextView) this.f9711c;
                ClipboardManager clipboardManager = (ClipboardManager) f8Var.getContext().getSystemService("clipboard");
                e3 e3Var = f8Var.Y.d;
                if ((TextUtils.isEmpty(e3Var.getText()) || TextUtils.equals(e3Var.getText(), "https://") || TextUtils.isEmpty(e3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    i10 = 1;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (i10 != 0) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (i10 != 0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                if (i10 == 0) {
                    f10 = 0.7f;
                }
                wh.q(scaleX.scaleY(f10), ds.h, 300L);
                return;
            case 20:
                n9 n9Var = (n9) this.f9710b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f9711c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new q0(21, n9Var, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 21:
                n9 n9Var2 = (n9) this.f9710b;
                HashMap hashMap = (HashMap) this.f9711c;
                if (n9Var2.P == null) {
                    n9Var2.P = new HashMap();
                }
                n9Var2.P.putAll(hashMap);
                return;
            case 22:
                fi.d dVar2 = (fi.d) this.f9710b;
                Runnable runnable = (Runnable) this.f9711c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                ac acVar = (ac) this.f9710b;
                Bitmap bitmap2 = (Bitmap) this.f9711c;
                if (acVar.f10533k && !acVar.f10531i) {
                    acVar.d.add(new zb(acVar, bitmap2));
                    acVar.f10533k = false;
                    acVar.f10536n.invalidate();
                    return;
                }
                return;
            case 24:
                int[] iArr = (int[]) this.f9710b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f9711c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 25:
                ((j0) this.f9710b).e((Typeface) this.f9711c);
                return;
            case 26:
                hi.k kVar = (hi.k) this.f9710b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f9711c;
                if (userFull != null) {
                    kVar.Y = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.f13052a0 = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.Y = true;
                        kVar.f13052a0 = kVar.E0();
                        kVar.Z = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.Z = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.f13052a0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.G0(true);
                return;
            case 27:
                qf.d.r(((hi.q) this.f9710b).getContext(), (String) this.f9711c);
                return;
            case 28:
                m3 m3Var = (m3) this.f9710b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f9711c;
                m3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    m3Var.g(botappsettings, true);
                    return;
                }
                return;
            default:
                m3 m3Var2 = (m3) this.f9710b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9711c;
                if (!m3Var2.f13106d0) {
                    if (tL_error != null) {
                        m3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(m3Var2.f13126u0, 60000L);
                        return;
                    }
                }
                return;
        }
    }
}
