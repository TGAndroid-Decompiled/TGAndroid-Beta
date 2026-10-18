package ei;

import ai.me;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class p6 implements Runnable {
    public final int f9595a;
    public final Object f9596b;
    public final Object f9597c;

    public p6(int i10, Object obj, Object obj2) {
        this.f9595a = i10;
        this.f9596b = obj;
        this.f9597c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        float f10 = 0.0f;
        float f11 = 1.0f;
        boolean z10 = true;
        int i11 = 0;
        switch (this.f9595a) {
            case 0:
                a8 a8Var = (a8) this.f9597c;
                r6 r6Var = (r6) ((androidx.biometric.e) this.f9596b).d;
                Bitmap bitmap = r6Var.f9708a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (a8Var.M0 == r6Var.f9708a) {
                        a8Var.M0 = null;
                    }
                    r6Var.f9708a = null;
                    r6Var.invalidate();
                    return;
                }
                return;
            case 1:
                v6 v6Var = (v6) this.f9596b;
                AtomicReference atomicReference = v6Var.f9939a;
                ?? obj = new Object();
                obj.f7392a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.t2((Context) this.f9597c, (com.google.android.gms.internal.vision.x1) obj)));
                v6Var.a(v6Var.f9942f);
                return;
            case 2:
                ((v6) this.f9596b).f9941c.run((t6) this.f9597c);
                return;
            case 3:
                p pVar = (p) this.f9596b;
                rg.b2 b2Var = (rg.b2) this.f9597c;
                d7 d7Var = pVar.f8964a;
                if (b2Var.getWidth() <= 0) {
                    d7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new com.google.firebase.messaging.s(pVar, 20)).start();
                    return;
                }
                float width = b2Var.getWidth() / d7Var.getWidth();
                ValueAnimator valueAnimator = pVar.f8971w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.f8971w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.f8971w.addUpdateListener(new c7(pVar, d7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((d7Var.getWidth() / 2.0f) + d7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((d7Var.getHeight() / 2.0f) + d7Var.getY()), 0));
                pVar.f8971w.addListener(new me(5, pVar, b2Var));
                pVar.f8971w.setDuration(320L);
                pVar.f8971w.setInterpolator(bs.h);
                pVar.v = b2Var;
                pVar.f8971w.start();
                return;
            case 4:
                s7 s7Var = (s7) this.f9596b;
                s7Var.L0 = false;
                s7Var.f9795b0.addAll((ArrayList) this.f9597c);
                s7Var.f9809q0.N(true);
                return;
            case 5:
                s7.S((s7) this.f9596b, (TLObject) this.f9597c);
                return;
            case 6:
                a8 a8Var2 = (a8) this.f9597c;
                TLObject tLObject = (TLObject) this.f9596b;
                a8Var2.f8709e1 = 0;
                if (tLObject instanceof Vector) {
                    a8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
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
                            tL_inputDocument.f20291id = document.f20285id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            a8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 7:
                j8.S((j8) this.f9596b, (TLObject) this.f9597c);
                return;
            case 8:
                j8 j8Var = (j8) this.f9596b;
                TextView textView = (TextView) this.f9597c;
                ClipboardManager clipboardManager = (ClipboardManager) j8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.g3 g3Var = j8Var.Y.f22405b;
                if ((!TextUtils.isEmpty(g3Var.getText()) && !TextUtils.equals(g3Var.getText(), "https://") && !TextUtils.isEmpty(g3Var.getText().toString())) || clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
                    z10 = false;
                }
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                if (!z10) {
                    f11 = 0.7f;
                }
                kk.t(scaleX.scaleY(f11), bs.h, 300L);
                return;
            case 9:
                r9 r9Var = (r9) this.f9596b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f9597c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new p6(10, r9Var, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 10:
                r9 r9Var2 = (r9) this.f9596b;
                HashMap hashMap = (HashMap) this.f9597c;
                if (r9Var2.P == null) {
                    r9Var2.P = new HashMap();
                }
                r9Var2.P.putAll(hashMap);
                return;
            case 11:
                d dVar = (d) this.f9596b;
                Runnable runnable = (Runnable) this.f9597c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                ec ecVar = (ec) this.f9596b;
                Bitmap bitmap2 = (Bitmap) this.f9597c;
                if (ecVar.f8990k && !ecVar.f8988i) {
                    ecVar.d.add(new dc(ecVar, bitmap2));
                    ecVar.f8990k = false;
                    ecVar.f8993n.invalidate();
                    return;
                }
                return;
            case 13:
                int[] iArr = (int[]) this.f9596b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f9597c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 14:
                gi.l lVar = (gi.l) this.f9596b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f9597c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.G0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.I0(true);
                return;
            case 15:
                gi.d3 d3Var = (gi.d3) this.f9596b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f9597c;
                d3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    d3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 16:
                gi.d3 d3Var2 = (gi.d3) this.f9596b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9597c;
                if (!d3Var2.f11142c0) {
                    if (tL_error != null) {
                        d3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(d3Var2.f11162t0, 60000L);
                        return;
                    }
                }
                return;
            case 17:
                gi.d3 d3Var3 = (gi.d3) this.f9596b;
                org.telegram.ui.Components.qc Q = new xc(d3Var3.f11156p0, d3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f9597c));
                Q.f29645j = 5000;
                Q.k(true);
                return;
            case 18:
                gi.u3 u3Var = (gi.u3) this.f9596b;
                u3Var.getMessagesController().openApp((TLRPC.User) this.f9597c, u3Var.getClassGuid());
                return;
            case 19:
                gi.u3 u3Var2 = (gi.u3) this.f9596b;
                u3Var2.getClass();
                u3Var2.presentFragment(sn.W9(((TL_payments.connectedBotStarRef) this.f9597c).bot_id));
                return;
            case 20:
                gi.f4 f4Var = (gi.f4) this.f9596b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9597c;
                if (!f4Var.T) {
                    if (tL_error2 != null) {
                        f4Var.f28245b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(f4Var.U, 60000L);
                        return;
                    }
                }
                return;
            case 21:
                gi.f4 f4Var2 = (gi.f4) this.f9596b;
                org.telegram.ui.Components.qc Q2 = new xc(f4Var2.f28245b.getContainer(), f4Var2.f28244a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f9597c));
                Q2.f29645j = 5000;
                Q2.k(true);
                return;
            case 22:
                ((e2.j0) this.f9596b).e((Typeface) this.f9597c);
                return;
            case 23:
                hg.c cVar = (hg.c) this.f9596b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f9597c);
                int i14 = cVar.G;
                MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.f11822w, location, false);
                return;
            case 24:
                hg.h0 h0Var = (hg.h0) this.f9596b;
                View view = (View) this.f9597c;
                h0Var.m0 = false;
                h0Var.f11891o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 25:
                hg.h0 h0Var2 = (hg.h0) this.f9596b;
                TLObject tLObject2 = (TLObject) this.f9597c;
                int i15 = h0Var2.f11897s0;
                ArrayList arrayList = h0Var2.K;
                h0Var2.S = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        h0Var2.l();
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i15).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.l();
                    return;
                } else {
                    return;
                }
            case 26:
                hg.h0 h0Var3 = (hg.h0) this.f9596b;
                StringBuilder sb2 = (StringBuilder) this.f9597c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(h0Var3.f11897s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                hg.t1 t1Var = (hg.t1) this.f9596b;
                String str = (String) this.f9597c;
                t1Var.I = str;
                if (t1Var.f12061r) {
                    t1Var.f12059f.g(str, true, false, t1Var.f12062s, t1Var.v, t1Var.f12064x, t1Var.f12063w, -1, 1);
                }
                int i16 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i16).contacts);
                t1Var.f12065y = true;
                int i17 = t1Var.F;
                t1Var.F = i17 + 1;
                t1Var.E = i17;
                t1Var.l();
                Utilities.searchQueue.postRunnable(new gi.m4(t1Var, str, i17, arrayList2, i16, 1));
                return;
            case 28:
                ArrayList arrayList3 = (ArrayList) this.f9597c;
                int i18 = ((hg.a2) this.f9596b).f11804m;
                try {
                    MessagesStorage.getInstance(i18).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i18).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList3.size() && i11 != 100) {
                            hg.y1 y1Var = (hg.y1) arrayList3.get(i11);
                            executeFast.requery();
                            executeFast.bindString(1, y1Var.f12112a);
                            executeFast.bindInteger(2, y1Var.f12113b);
                            executeFast.step();
                            i11++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i18).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((hg.y1) arrayList3.get(i10)).f12112a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i18).getDatabase().commitTransaction();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                hi.r rVar = (hi.r) this.f9596b;
                rVar.getClass();
                rVar.presentFragment(sn.W9(((ii.e) this.f9597c).f13162b.f20426id));
                return;
        }
    }

    public p6(a8 a8Var, TLObject tLObject) {
        this.f9595a = 6;
        this.f9597c = a8Var;
        this.f9596b = tLObject;
    }
}
