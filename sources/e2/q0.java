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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.ds;
import sg.d2;
public final class q0 implements Runnable {
    public final int f9710a;
    public final Object f9711b;
    public final Object f9712c;

    public q0(int i10, Object obj, Object obj2) {
        this.f9710a = i10;
        this.f9711b = obj;
        this.f9712c = obj2;
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
        switch (this.f9710a) {
            case 0:
                n4.s sVar = (n4.s) this.f9711b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f9712c;
                synchronized (sVar) {
                    if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) sVar.f18697c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 1:
                ea.c cVar = (ea.c) this.f9711b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f9712c;
                try {
                    m5.t.a().d.e(cVar.h.f18352a.b(j5.d.f15515c), 1);
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 2:
                ei.v vVar = (ei.v) this.f9711b;
                String str = (String) this.f9712c;
                ArrayList arrayList = vVar.f10018f;
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
                    vVar.f10020r.d(str.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 3:
                fi.d dVar = (fi.d) this.f9711b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f9712c;
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
                ((Utilities.Callback) this.f9711b).run((ArrayList) this.f9712c);
                return;
            case 5:
                s1 s1Var = (s1) this.f9711b;
                TLObject tLObject = (TLObject) this.f9712c;
                u1 u1Var = s1Var.f11578s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    l2 l2Var = u1Var.f11746r;
                    MessagesController.getInstance(l2.D(l2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(l2.F(l2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(l2.H(l2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                s1Var.f11576n = true;
                s1Var.G();
                return;
            case 6:
                ((q2) this.f9711b).e(0.0f, 240L, (Runnable) this.f9712c);
                return;
            case 7:
                e6 e6Var = (e6) this.f9711b;
                View view = (View) this.f9712c;
                e6Var.getClass();
                if (view instanceof sg.j) {
                    sg.j jVar = (sg.j) view;
                    jVar.m();
                    e6Var.A0(jVar, true);
                    return;
                }
                return;
            case 8:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f9711b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f9712c;
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
                ((Utilities.Callback) this.f9711b).run((Bitmap) this.f9712c);
                return;
            case 10:
                o6.a((o6) this.f9711b, (w7) this.f9712c);
                return;
            case 11:
                w7 w7Var = (w7) this.f9712c;
                o6 o6Var = (o6) ((a8.h0) this.f9711b).d;
                Bitmap bitmap = o6Var.f11361a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (w7Var.M0 == o6Var.f11361a) {
                        w7Var.M0 = null;
                    }
                    o6Var.f11361a = null;
                    o6Var.invalidate();
                    return;
                }
                return;
            case 12:
                fi.s6 s6Var = (fi.s6) this.f9711b;
                AtomicReference atomicReference = s6Var.f11588a;
                ?? obj = new Object();
                obj.f7500a = 256;
                atomicReference.set(new s8.n(new t2((Context) this.f9712c, (x1) obj)));
                s6Var.a(s6Var.f11591f);
                return;
            case 13:
                ((fi.s6) this.f9711b).f11590c.run((q6) this.f9712c);
                return;
            case 14:
                fi.p pVar = (fi.p) this.f9711b;
                d2 d2Var = (d2) this.f9712c;
                a7 a7Var = pVar.f10566a;
                if (d2Var.getWidth() <= 0) {
                    a7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new s8(pVar, 24)).start();
                    return;
                }
                float width = d2Var.getWidth() / a7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f10573w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f10573w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f10573w.addUpdateListener(new z6(pVar, a7Var.getScaleX(), width, ((d2Var.getWidth() / 2.0f) + d2Var.getX()) - ((a7Var.getWidth() / 2.0f) + a7Var.getX()), ((d2Var.getHeight() / 2.0f) + d2Var.getY()) - ((a7Var.getHeight() / 2.0f) + a7Var.getY()), 0));
                pVar.f10573w.addListener(new ce(5, pVar, d2Var));
                pVar.f10573w.setDuration(320L);
                pVar.f10573w.setInterpolator(ds.h);
                pVar.v = d2Var;
                pVar.f10573w.start();
                return;
            case 15:
                o7.T((o7) this.f9711b, (TLObject) this.f9712c);
                return;
            case 16:
                o7 o7Var = (o7) this.f9711b;
                o7Var.K0 = false;
                o7Var.f11397b0.addAll((ArrayList) this.f9712c);
                o7Var.f11410p0.O(true);
                return;
            case 17:
                w7 w7Var2 = (w7) this.f9711b;
                TLObject tLObject2 = (TLObject) this.f9712c;
                w7Var2.f11900e1 = 0;
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
                            tL_inputDocument.f22039id = document.f22033id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            w7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 18:
                f8.R((f8) this.f9711b, (TLObject) this.f9712c);
                return;
            case 19:
                f8 f8Var = (f8) this.f9711b;
                TextView textView = (TextView) this.f9712c;
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
                vh.q(scaleX.scaleY(f10), ds.h, 300L);
                return;
            case 20:
                n9 n9Var = (n9) this.f9711b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f9712c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new q0(21, n9Var, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 21:
                n9 n9Var2 = (n9) this.f9711b;
                HashMap hashMap = (HashMap) this.f9712c;
                if (n9Var2.P == null) {
                    n9Var2.P = new HashMap();
                }
                n9Var2.P.putAll(hashMap);
                return;
            case 22:
                fi.d dVar2 = (fi.d) this.f9711b;
                Runnable runnable = (Runnable) this.f9712c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                ac acVar = (ac) this.f9711b;
                Bitmap bitmap2 = (Bitmap) this.f9712c;
                if (acVar.f10534k && !acVar.f10532i) {
                    acVar.d.add(new zb(acVar, bitmap2));
                    acVar.f10534k = false;
                    acVar.f10537n.invalidate();
                    return;
                }
                return;
            case 24:
                int[] iArr = (int[]) this.f9711b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f9712c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 25:
                ((j0) this.f9711b).e((Typeface) this.f9712c);
                return;
            case 26:
                hi.k kVar = (hi.k) this.f9711b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f9712c;
                if (userFull != null) {
                    kVar.Y = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.f13053a0 = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.Y = true;
                        kVar.f13053a0 = kVar.E0();
                        kVar.Z = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.Z = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.f13053a0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.G0(true);
                return;
            case 27:
                qf.d.r(((hi.q) this.f9711b).getContext(), (String) this.f9712c);
                return;
            case 28:
                m3 m3Var = (m3) this.f9711b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f9712c;
                m3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    m3Var.g(botappsettings, true);
                    return;
                }
                return;
            default:
                m3 m3Var2 = (m3) this.f9711b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9712c;
                if (!m3Var2.f13107d0) {
                    if (tL_error != null) {
                        m3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(m3Var2.f13127u0, 60000L);
                        return;
                    }
                }
                return;
        }
    }
}
