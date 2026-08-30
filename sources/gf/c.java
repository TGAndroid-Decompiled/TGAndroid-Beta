package gf;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import cg.h0;
import g5.r;
import gg.b0;
import gg.b1;
import gg.b2;
import gg.t0;
import gg.v2;
import h5.d0;
import h5.u;
import hh.k;
import i5.t;
import i5.y;
import j3.a0;
import j3.c0;
import j3.e0;
import j3.e2;
import j3.f0;
import j3.m2;
import j3.o2;
import j3.u1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kh.a1;
import kh.n3;
import kh.r1;
import kh.x1;
import l3.k0;
import l3.q;
import lh.z;
import o4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class c implements Runnable {
    public final int f6533a;
    public final Object f6534b;
    public final Object f6535c;

    public c(int i10, Object obj, Object obj2) {
        this.f6533a = i10;
        this.f6534b = obj;
        this.f6535c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        File pathToAttach;
        long j10;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        int i11 = 0;
        switch (this.f6533a) {
            case 0:
                e eVar = (e) this.f6534b;
                ArrayList arrayList = (ArrayList) this.f6535c;
                while (i11 < arrayList.size()) {
                    d dVar = (d) arrayList.get(i11);
                    if (dVar != null && ((TextUtils.isEmpty(dVar.f6537b) || !new File(dVar.f6537b).exists()) && (document = dVar.f6536a) != null && ((pathToAttach = FileLoader.getInstance(eVar.f6543c).getPathToAttach(document)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new c(1, eVar, document));
                    }
                    i11++;
                }
                return;
            case 1:
                TLRPC.Document document2 = (TLRPC.Document) this.f6535c;
                FileLoader.getInstance(((e) this.f6534b).f6543c).loadFile(document2, document2, 0, 0);
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6535c;
                int i12 = ((f) this.f6534b).f6545a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i12).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i12).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 3:
                ((b2) this.f6534b).run((ArrayList) this.f6535c);
                return;
            case 4:
                ((t0) this.f6534b).run((TLRPC.TL_error) this.f6535c);
                return;
            case 5:
                ((vk) this.f6534b).run((ArrayList) this.f6535c);
                return;
            case 6:
                Utilities.Callback callback = (Utilities.Callback) this.f6535c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f6534b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b0(callback, smallGroupsParticipantsCount, 0));
                    return;
                }
                return;
            case 7:
                ic M = qc.a0((xn) this.f6534b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f6535c).stars)), R.raw.stars_send);
                M.f25672j = 5000;
                M.k(true);
                return;
            case 8:
                b1 b1Var = (b1) this.f6534b;
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f6535c);
                return;
            case 9:
                v2.P((v2) this.f6534b, (TLObject) this.f6535c);
                return;
            case 10:
                ((h5.b0) this.f6534b).e((Typeface) this.f6535c);
                return;
            case 11:
                ((r) this.f6535c).a(((u) this.f6534b).f());
                return;
            case 12:
                k kVar = (k) this.f6534b;
                kVar.f7169b.add((String) this.f6535c);
                kVar.invalidate();
                return;
            case 13:
                y yVar = (y) this.f6535c;
                int i13 = d0.f6937a;
                f0 f0Var = ((c0) ((f7.b) this.f6534b).f6013c).f8441a;
                f0Var.f8544d0 = yVar;
                f0Var.f8556l.e(25, new a0(yVar));
                return;
            case 14:
                int i14 = d0.f6937a;
                k3.f fVar = ((c0) ((f7.b) this.f6534b).f6013c).f8441a.f8561q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1019, new k3.c(p10, (String) this.f6535c, 26));
                return;
            case 15:
                int i15 = d0.f6937a;
                k3.f fVar2 = ((c0) ((f7.b) this.f6534b).f6013c).f8441a.f8561q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1030, new k3.e(p11, (Exception) this.f6535c, 4));
                return;
            case 16:
                ((h0) this.f6534b).run((TLRPC.Chat) this.f6535c);
                return;
            case 17:
                f0 f0Var2 = (f0) this.f6534b;
                ye.f fVar3 = (ye.f) this.f6535c;
                int i16 = f0Var2.F - fVar3.f47171c;
                f0Var2.F = i16;
                if (fVar3.d) {
                    f0Var2.G = fVar3.e;
                    f0Var2.H = true;
                }
                if (fVar3.f47172f) {
                    f0Var2.I = fVar3.f47173g;
                }
                if (i16 == 0) {
                    o2 o2Var = ((u1) fVar3.h).f8832a;
                    if (!f0Var2.f8547f0.f8832a.p() && o2Var.p()) {
                        f0Var2.f8549g0 = -1;
                        f0Var2.f8550h0 = 0L;
                    }
                    if (!o2Var.p()) {
                        List asList = Arrays.asList(((e2) o2Var).f8537r);
                        if (asList.size() == f0Var2.f8559o.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h5.a.i(z11);
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((e0) f0Var2.f8559o.get(i17)).f8499b = (o2) asList.get(i17);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (f0Var2.H) {
                        if (((u1) fVar3.h).f8833b.equals(f0Var2.f8547f0.f8833b) && ((u1) fVar3.h).d == f0Var2.f8547f0.f8846r) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (!o2Var.p() && !((u1) fVar3.h).f8833b.a()) {
                                u1 u1Var = (u1) fVar3.h;
                                v vVar = u1Var.f8833b;
                                long j12 = u1Var.d;
                                Object obj = vVar.f16424a;
                                m2 m2Var = f0Var2.f8558n;
                                o2Var.g(obj, m2Var);
                                j11 = j12 + m2Var.e;
                            } else {
                                j11 = ((u1) fVar3.h).d;
                            }
                        }
                        j10 = j11;
                        z4 = z10;
                    } else {
                        j10 = -9223372036854775807L;
                        z4 = false;
                    }
                    f0Var2.H = false;
                    f0Var2.h0((u1) fVar3.h, 1, f0Var2.I, z4, f0Var2.G, j10, -1);
                    return;
                }
                return;
            case 18:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f6535c;
                ArrayList arrayList2 = ((c0) this.f6534b).f8441a.f8554j0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((i71) ((t) obj2)).G.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 19:
                jh.v vVar2 = (jh.v) this.f6534b;
                g5 g5Var = (g5) this.f6535c;
                int i18 = vVar2.f9486k;
                p2 p2Var = vVar2.f9483g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                vVar2.f9493r = importer;
                LongSparseArray longSparseArray = vVar2.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    p2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (user.photo != null && !z12) {
                        if (vVar2.f9494s == null) {
                            jh.u uVar = new jh.u(vVar2, p2Var.getParentActivity(), (sl0) g5Var.getParent(), p2Var.getResourceProvider(), vVar2.f9479a);
                            vVar2.f9494s = uVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar2.f9493r;
                            p9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = uVar.e;
                            vh0 vh0Var = uVar.h;
                            uVar.f9474r = tL_chatInviteImporter;
                            uVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            vh0Var.setParentAvatarImage(avatarImageView);
                            vh0Var.M(tL_chatInviteImporter.user_id, true);
                            vh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            uVar.f9478y.requestLayout();
                            vVar2.f9494s.setOnDismissListener(new eg.d0(vVar2, 2));
                            vVar2.f9494s.show();
                            return;
                        }
                        return;
                    }
                    vVar2.f9480b = true;
                    p2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f19331id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    p2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 20:
                kh.c cVar = (kh.c) this.f6534b;
                cVar.getClass();
                ((View.OnClickListener) this.f6535c).onClick(cVar);
                return;
            case 21:
                ((r1) this.f6534b).getBulletinFactory().d0((TLRPC.TL_error) this.f6535c, false);
                return;
            case 22:
                x1 x1Var = (x1) this.f6534b;
                x1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f6535c).unsaved) {
                    x1Var.C.setVisibility(8);
                    return;
                }
                return;
            case 23:
                or0 or0Var = (or0) this.f6534b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f6535c;
                or0Var.h(tL_starGiftCollection.title, new a1(2, or0Var, tL_starGiftCollection));
                return;
            case 24:
                AndroidUtilities.addToClipboard((String) this.f6535c);
                qc.a0(((n3) this.f6534b).f10719a.f10939a).k(false).j();
                return;
            case 25:
                int i19 = d0.f6937a;
                k3.f fVar4 = ((c0) ((q) ((f7.b) this.f6534b).f6013c)).f8441a.f8561q;
                k3.a p12 = fVar4.p();
                fVar4.q(p12, 1012, new k3.c(p12, (String) this.f6535c, 7));
                return;
            case 26:
                AudioTrack audioTrack = (AudioTrack) this.f6534b;
                h5.c cVar2 = (h5.c) this.f6535c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar2.c();
                    synchronized (k0.f11163g0) {
                        try {
                            int i20 = k0.f11165i0 - 1;
                            k0.f11165i0 = i20;
                            if (i20 == 0) {
                                k0.f11164h0.shutdown();
                                k0.f11164h0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    cVar2.c();
                    synchronized (k0.f11163g0) {
                        try {
                            int i21 = k0.f11165i0 - 1;
                            k0.f11165i0 = i21;
                            if (i21 == 0) {
                                k0.f11164h0.shutdown();
                                k0.f11164h0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 27:
                lh.y yVar2 = (lh.y) this.f6534b;
                TLObject tLObject = (TLObject) this.f6535c;
                int i22 = yVar2.f13367a;
                ArrayList arrayList3 = yVar2.e;
                yVar2.f13372i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i22).putUsers(connectedstarrefbots.users, false);
                    if (yVar2.f13369c <= 0) {
                        arrayList3.clear();
                    }
                    yVar2.f13369c = connectedstarrefbots.count;
                    arrayList3.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList3.size() < yVar2.f13369c) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    yVar2.d = z13;
                } else {
                    yVar2.h = true;
                    yVar2.d = true;
                }
                yVar2.f13371g = false;
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(yVar2.f13368b));
                return;
            case 28:
                z zVar = (z) this.f6534b;
                TLObject tLObject2 = (TLObject) this.f6535c;
                int i23 = zVar.f13416a;
                ArrayList arrayList4 = zVar.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i23).putUsers(suggestedstarrefbots.users, false);
                    if (zVar.f13418c <= 0) {
                        arrayList4.clear();
                    }
                    zVar.f13418c = suggestedstarrefbots.count;
                    arrayList4.addAll(suggestedstarrefbots.suggested_bots);
                    zVar.f13422j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList4.size() < zVar.f13418c) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    zVar.d = z14;
                } else {
                    zVar.f13421i = true;
                    zVar.d = true;
                }
                zVar.h = false;
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(zVar.f13417b));
                return;
            default:
                lh.g5.U0((lh.g5) this.f6534b, (Long) this.f6535c);
                return;
        }
    }
}
