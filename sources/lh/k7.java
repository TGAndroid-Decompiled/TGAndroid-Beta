package lh;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.er;
import org.telegram.ui.c31;
import org.telegram.ui.rn;

public final class k7 implements Runnable {

    public final int f16244a;

    public final Object f16245b;

    public final Object f16246c;

    public k7(int i10, Object obj, Object obj2) {
        this.f16244a = i10;
        this.f16246c = obj;
        this.f16245b = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        switch (this.f16244a) {
            case 0:
                r7.R((r7) this.f16246c, (TLObject) this.f16245b);
                break;
            case 1:
                z7 z7Var = (z7) this.f16246c;
                TLObject tLObject = (TLObject) this.f16245b;
                z7Var.f17206e1 = 0;
                if (tLObject instanceof Vector) {
                    z7Var.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i10);
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
                            tL_inputDocument.f22392id = document.f22386id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            z7Var.V0.add(tL_inputDocument);
                        }
                    }
                }
                break;
            case 2:
                j8.R((j8) this.f16246c, (TLObject) this.f16245b);
                break;
            case 3:
                j8 j8Var = (j8) this.f16246c;
                TextView textView = (TextView) this.f16245b;
                ClipboardManager clipboardManager = (ClipboardManager) j8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.e3 e3Var = j8Var.U.f24370b;
                boolean z10 = (TextUtils.isEmpty(e3Var.getText()) || TextUtils.equals(e3Var.getText(), "https://") || TextUtils.isEmpty(e3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                rl.o(textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f), er.h, 300L);
                break;
            case 4:
                q9 q9Var = (q9) this.f16246c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f16245b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new k7(5, q9Var, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 5:
                q9 q9Var2 = (q9) this.f16246c;
                HashMap map = (HashMap) this.f16245b;
                if (q9Var2.L == null) {
                    q9Var2.L = new HashMap();
                }
                q9Var2.L.putAll(map);
                break;
            case 6:
                d dVar = (d) this.f16246c;
                Runnable runnable = (Runnable) this.f16245b;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 7:
                ac acVar = (ac) this.f16246c;
                Bitmap bitmap = (Bitmap) this.f16245b;
                if (acVar.f15665k && !acVar.f15663i) {
                    acVar.d.add(new zb(acVar, bitmap));
                    acVar.f15665k = false;
                    acVar.f15668n.invalidate();
                    break;
                }
                break;
            case 8:
                int[] iArr = (int[]) this.f16246c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f16245b;
                int i11 = iArr[0];
                if (i11 != 0) {
                    connectionsManager.cancelRequest(i11, true);
                    iArr[0] = 0;
                }
                break;
            case 9:
                nh.k kVar = (nh.k) this.f16246c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f16245b;
                if (userFull != null) {
                    kVar.S = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.U = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.S = true;
                        kVar.U = kVar.F0();
                        kVar.T = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.T = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.U;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.H0(true);
                break;
            case 10:
                nh.b3 b3Var = (nh.b3) this.f16246c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f16245b;
                b3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    b3Var.g(botappsettings, true);
                    break;
                }
                break;
            case 11:
                nh.b3 b3Var2 = (nh.b3) this.f16246c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16245b;
                if (!b3Var2.Y) {
                    if (tL_error != null) {
                        b3Var2.k(false);
                    } else {
                        AndroidUtilities.runOnUIThread(b3Var2.f18588p0, 60000L);
                    }
                    break;
                }
                break;
            case 12:
                nh.b3 b3Var3 = (nh.b3) this.f16246c;
                org.telegram.ui.Components.ec ecVarQ = new org.telegram.ui.Components.mc(b3Var3.f18584l0, b3Var3.A).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f16245b));
                ecVarQ.f28020j = 5000;
                ecVarQ.k(true);
                break;
            case 13:
                nh.s3 s3Var = (nh.s3) this.f16246c;
                s3Var.getMessagesController().openApp((TLRPC.User) this.f16245b, s3Var.getClassGuid());
                break;
            case 14:
                nh.s3 s3Var2 = (nh.s3) this.f16246c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f16245b;
                s3Var2.getClass();
                s3Var2.presentFragment(rn.R9(connectedbotstarref.bot_id));
                break;
            case 15:
                nh.e4 e4Var = (nh.e4) this.f16246c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f16245b;
                if (!e4Var.P) {
                    if (tL_error2 != null) {
                        e4Var.f34900b.dismiss();
                    } else {
                        AndroidUtilities.runOnUIThread(e4Var.Q, 60000L);
                    }
                    break;
                }
                break;
            case 16:
                nh.e4 e4Var2 = (nh.e4) this.f16246c;
                org.telegram.ui.Components.ec ecVarQ2 = new org.telegram.ui.Components.mc(e4Var2.f34900b.getContainer(), e4Var2.f34899a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f16245b));
                ecVarQ2.f28020j = 5000;
                ecVarQ2.k(true);
                break;
            case 17:
                oh.r rVar = (oh.r) this.f16246c;
                ph.e eVar = (ph.e) this.f16245b;
                rVar.getClass();
                rVar.presentFragment(rn.R9(eVar.f46036b.f22527id));
                break;
            case 18:
                ((oh.j0) this.f16246c).f19504s.presentFragment(rn.R9(((ph.e) this.f16245b).f46036b.f22527id));
                break;
            case 19:
                ((VideoAds) this.f16246c).lambda$showPremium$19((ag.g2) this.f16245b);
                break;
            case 20:
                ((VideoAds) this.f16246c).lambda$load$0((TLObject) this.f16245b);
                break;
            case 21:
                ((VideoAds) this.f16246c).lambda$show$16((Utilities.Callback) this.f16245b);
                break;
            case 22:
                c31.T((Context) this.f16246c, null, false, (jh.h0) this.f16245b, null);
                break;
            case 23:
                ((AudioRecordJNI) this.f16246c).lambda$startThread$0((ByteBuffer) this.f16245b);
                break;
            case 24:
                ((ConferenceCall) this.f16246c).lambda$processUpdates$4((TLRPC.Updates) this.f16245b);
                break;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.f16246c, (Point) this.f16245b);
                break;
            case 26:
                ((VideoCapturerDevice) this.f16246c).lambda$init$4((String) this.f16245b);
                break;
            case 27:
                ((VoIPService) this.f16246c).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.f16245b);
                break;
            case 28:
                ((VoIPService) this.f16246c).lambda$createGroupInstance$71((String) this.f16245b);
                break;
            default:
                ((VoIPService) this.f16246c).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.j0) this.f16245b);
                break;
        }
    }
}
