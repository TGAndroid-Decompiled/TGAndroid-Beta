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
import dg.h0;
import g5.r;
import h5.b0;
import h5.d0;
import h5.u;
import hg.b1;
import hg.b2;
import hg.t0;
import hg.v2;
import i5.t;
import i5.y;
import ih.k;
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
import l3.k0;
import l3.q;
import lh.a1;
import lh.n3;
import lh.r1;
import lh.x1;
import mh.x;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class c implements Runnable {
    public final int f7030a;
    public final Object f7031b;
    public final Object f7032c;

    public c(int i10, Object obj, Object obj2) {
        this.f7030a = i10;
        this.f7031b = obj;
        this.f7032c = obj2;
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
        switch (this.f7030a) {
            case 0:
                e eVar = (e) this.f7031b;
                ArrayList arrayList = (ArrayList) this.f7032c;
                while (i11 < arrayList.size()) {
                    d dVar = (d) arrayList.get(i11);
                    if (dVar != null && ((TextUtils.isEmpty(dVar.f7034b) || !new File(dVar.f7034b).exists()) && (document = dVar.f7033a) != null && ((pathToAttach = FileLoader.getInstance(eVar.f7040c).getPathToAttach(document)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new c(1, eVar, document));
                    }
                    i11++;
                }
                return;
            case 1:
                TLRPC.Document document2 = (TLRPC.Document) this.f7032c;
                FileLoader.getInstance(((e) this.f7031b).f7040c).loadFile(document2, document2, 0, 0);
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f7032c;
                int i12 = ((f) this.f7031b).f7043a;
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
                ((b0) this.f7031b).e((Typeface) this.f7032c);
                return;
            case 4:
                ((r) this.f7032c).a(((u) this.f7031b).f());
                return;
            case 5:
                ((b2) this.f7031b).run((ArrayList) this.f7032c);
                return;
            case 6:
                ((t0) this.f7031b).run((TLRPC.TL_error) this.f7032c);
                return;
            case 7:
                ((xk) this.f7031b).run((ArrayList) this.f7032c);
                return;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.f7032c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f7031b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new hg.b0(callback, smallGroupsParticipantsCount, 0));
                    return;
                }
                return;
            case 9:
                ic M = qc.a0((xn) this.f7031b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f7032c).stars)), R.raw.stars_send);
                M.f27745j = 5000;
                M.k(true);
                return;
            case 10:
                b1 b1Var = (b1) this.f7031b;
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f7032c);
                return;
            case 11:
                v2.P((v2) this.f7031b, (TLObject) this.f7032c);
                return;
            case 12:
                y yVar = (y) this.f7032c;
                int i13 = d0.f7237a;
                f0 f0Var = ((c0) ((f7.b) this.f7031b).f6121c).f9000a;
                f0Var.f9110d0 = yVar;
                f0Var.f9123l.e(25, new a0(yVar));
                return;
            case 13:
                int i14 = d0.f7237a;
                k3.f fVar = ((c0) ((f7.b) this.f7031b).f6121c).f9000a.f9128q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1019, new k3.c(p10, (String) this.f7032c, 26));
                return;
            case 14:
                int i15 = d0.f7237a;
                k3.f fVar2 = ((c0) ((f7.b) this.f7031b).f6121c).f9000a.f9128q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1030, new k3.e(p11, (Exception) this.f7032c, 4));
                return;
            case 15:
                k kVar = (k) this.f7031b;
                kVar.f8171b.add((String) this.f7032c);
                kVar.invalidate();
                return;
            case 16:
                f0 f0Var2 = (f0) this.f7031b;
                ye.f fVar3 = (ye.f) this.f7032c;
                int i16 = f0Var2.F - fVar3.f50868c;
                f0Var2.F = i16;
                if (fVar3.d) {
                    f0Var2.G = fVar3.f50869e;
                    f0Var2.H = true;
                }
                if (fVar3.f50870f) {
                    f0Var2.I = fVar3.f50871g;
                }
                if (i16 == 0) {
                    o2 o2Var = ((u1) fVar3.h).f9426a;
                    if (!f0Var2.f9114f0.f9426a.p() && o2Var.p()) {
                        f0Var2.f9116g0 = -1;
                        f0Var2.f9117h0 = 0L;
                    }
                    if (!o2Var.p()) {
                        List asList = Arrays.asList(((e2) o2Var).f9103r);
                        if (asList.size() == f0Var2.f9126o.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h5.a.i(z11);
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((e0) f0Var2.f9126o.get(i17)).f9063b = (o2) asList.get(i17);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (f0Var2.H) {
                        if (((u1) fVar3.h).f9427b.equals(f0Var2.f9114f0.f9427b) && ((u1) fVar3.h).d == f0Var2.f9114f0.f9441r) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (!o2Var.p() && !((u1) fVar3.h).f9427b.a()) {
                                u1 u1Var = (u1) fVar3.h;
                                v vVar = u1Var.f9427b;
                                long j12 = u1Var.d;
                                Object obj = vVar.f16579a;
                                m2 m2Var = f0Var2.f9125n;
                                o2Var.g(obj, m2Var);
                                j11 = j12 + m2Var.f9286e;
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
            case 17:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f7032c;
                ArrayList arrayList2 = ((c0) this.f7031b).f9000a.f9121j0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((k71) ((t) obj2)).G.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 18:
                ((h0) this.f7031b).run((TLRPC.Chat) this.f7032c);
                return;
            case 19:
                kh.v vVar2 = (kh.v) this.f7031b;
                g5 g5Var = (g5) this.f7032c;
                int i18 = vVar2.f11312k;
                p2 p2Var = vVar2.f11309g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                vVar2.f11319r = importer;
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
                        if (vVar2.f11320s == null) {
                            kh.u uVar = new kh.u(vVar2, p2Var.getParentActivity(), (tl0) g5Var.getParent(), p2Var.getResourceProvider(), vVar2.f11304a);
                            vVar2.f11320s = uVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar2.f11319r;
                            p9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = uVar.f11296e;
                            xh0 xh0Var = uVar.h;
                            uVar.f11299r = tL_chatInviteImporter;
                            uVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            xh0Var.setParentAvatarImage(avatarImageView);
                            xh0Var.M(tL_chatInviteImporter.user_id, true);
                            xh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            uVar.f11303y.requestLayout();
                            vVar2.f11320s.setOnDismissListener(new fg.d0(vVar2, 2));
                            vVar2.f11320s.show();
                            return;
                        }
                        return;
                    }
                    vVar2.f11305b = true;
                    p2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f20990id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    p2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 20:
                int i19 = d0.f7237a;
                k3.f fVar4 = ((c0) ((q) ((f7.b) this.f7031b).f6121c)).f9000a.f9128q;
                k3.a p12 = fVar4.p();
                fVar4.q(p12, 1012, new k3.c(p12, (String) this.f7032c, 7));
                return;
            case 21:
                AudioTrack audioTrack = (AudioTrack) this.f7031b;
                h5.c cVar = (h5.c) this.f7032c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (k0.f11527g0) {
                        try {
                            int i20 = k0.f11529i0 - 1;
                            k0.f11529i0 = i20;
                            if (i20 == 0) {
                                k0.f11528h0.shutdown();
                                k0.f11528h0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    cVar.c();
                    synchronized (k0.f11527g0) {
                        try {
                            int i21 = k0.f11529i0 - 1;
                            k0.f11529i0 = i21;
                            if (i21 == 0) {
                                k0.f11528h0.shutdown();
                                k0.f11528h0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 22:
                lh.c cVar2 = (lh.c) this.f7031b;
                cVar2.getClass();
                ((View.OnClickListener) this.f7032c).onClick(cVar2);
                return;
            case 23:
                ((r1) this.f7031b).getBulletinFactory().d0((TLRPC.TL_error) this.f7032c, false);
                return;
            case 24:
                x1 x1Var = (x1) this.f7031b;
                x1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f7032c).unsaved) {
                    x1Var.C.setVisibility(8);
                    return;
                }
                return;
            case 25:
                pr0 pr0Var = (pr0) this.f7031b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f7032c;
                pr0Var.h(tL_starGiftCollection.title, new a1(2, pr0Var, tL_starGiftCollection));
                return;
            case 26:
                AndroidUtilities.addToClipboard((String) this.f7032c);
                qc.a0(((n3) this.f7031b).f12860a.f13098a).k(false).j();
                return;
            case 27:
                x xVar = (x) this.f7031b;
                TLObject tLObject = (TLObject) this.f7032c;
                int i22 = xVar.f15018a;
                ArrayList arrayList3 = xVar.f15021e;
                xVar.f15024i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i22).putUsers(connectedstarrefbots.users, false);
                    if (xVar.f15020c <= 0) {
                        arrayList3.clear();
                    }
                    xVar.f15020c = connectedstarrefbots.count;
                    arrayList3.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList3.size() < xVar.f15020c) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    xVar.d = z13;
                } else {
                    xVar.h = true;
                    xVar.d = true;
                }
                xVar.f15023g = false;
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(xVar.f15019b));
                return;
            case 28:
                mh.y yVar2 = (mh.y) this.f7031b;
                TLObject tLObject2 = (TLObject) this.f7032c;
                int i23 = yVar2.f15068a;
                ArrayList arrayList4 = yVar2.f15071e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i23).putUsers(suggestedstarrefbots.users, false);
                    if (yVar2.f15070c <= 0) {
                        arrayList4.clear();
                    }
                    yVar2.f15070c = suggestedstarrefbots.count;
                    arrayList4.addAll(suggestedstarrefbots.suggested_bots);
                    yVar2.f15075j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList4.size() < yVar2.f15070c) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    yVar2.d = z14;
                } else {
                    yVar2.f15074i = true;
                    yVar2.d = true;
                }
                yVar2.h = false;
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(yVar2.f15069b));
                return;
            default:
                mh.g5.U0((mh.g5) this.f7031b, (Long) this.f7032c);
                return;
        }
    }
}
