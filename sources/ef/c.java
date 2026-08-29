package ef;

import ag.i0;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.s;
import eg.c0;
import eg.c1;
import eg.c2;
import eg.u0;
import eg.w2;
import f5.b0;
import f5.d0;
import f5.u;
import fh.k;
import g5.t;
import g5.y;
import hh.v;
import ih.b1;
import ih.n3;
import ih.s1;
import ih.y1;
import j3.e0;
import j3.f2;
import j3.h0;
import j3.j0;
import j3.k0;
import j3.p2;
import j3.r2;
import j3.w1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import jh.h5;
import jh.s7;
import jh.z;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.x61;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
public final class c implements Runnable {
    public final int f5890a;
    public final Object f5891b;
    public final Object f5892c;

    public c(int i10, Object obj, Object obj2) {
        this.f5890a = i10;
        this.f5891b = obj;
        this.f5892c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        File pathToAttach;
        boolean z10;
        int i10;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        int i11 = 0;
        switch (this.f5890a) {
            case 0:
                e eVar = (e) this.f5891b;
                ArrayList arrayList = (ArrayList) this.f5892c;
                while (i11 < arrayList.size()) {
                    d dVar = (d) arrayList.get(i11);
                    if (dVar != null && ((TextUtils.isEmpty(dVar.f5894b) || !new File(dVar.f5894b).exists()) && (document = dVar.f5893a) != null && ((pathToAttach = FileLoader.getInstance(eVar.f5900c).getPathToAttach(document)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new c(1, eVar, document));
                    }
                    i11++;
                }
                return;
            case 1:
                TLRPC.Document document2 = (TLRPC.Document) this.f5892c;
                FileLoader.getInstance(((e) this.f5891b).f5900c).loadFile(document2, document2, 0, 0);
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f5892c;
                int i12 = ((f) this.f5891b).f5903a;
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
                ((c2) this.f5891b).run((ArrayList) this.f5892c);
                return;
            case 4:
                ((u0) this.f5891b).run((TLRPC.TL_error) this.f5892c);
                return;
            case 5:
                ((tm) this.f5891b).run((ArrayList) this.f5892c);
                return;
            case 6:
                Utilities.Callback callback = (Utilities.Callback) this.f5892c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f5891b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new c0(callback, smallGroupsParticipantsCount, 0));
                    return;
                }
                return;
            case 7:
                mc M = tc.a0((tn) this.f5891b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f5892c).stars)), R.raw.stars_send);
                M.f30652j = 5000;
                M.k(true);
                return;
            case 8:
                c1 c1Var = (c1) this.f5891b;
                c1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, c1Var.X, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f5892c);
                return;
            case 9:
                w2.P((w2) this.f5891b, (TLObject) this.f5892c);
                return;
            case 10:
                ((s) this.f5892c).a(((u) this.f5891b).g());
                return;
            case 11:
                k kVar = (k) this.f5891b;
                kVar.f6828b.add((String) this.f5892c);
                kVar.invalidate();
                return;
            case 12:
                y yVar = (y) this.f5892c;
                int i13 = d0.f6579a;
                k0 k0Var = ((h0) ((ze.b) this.f5891b).f50825b).f10477a;
                k0Var.f10579g0 = yVar;
                k0Var.f10587l.e(25, new e0(yVar));
                return;
            case 13:
                int i14 = d0.f6579a;
                k3.f fVar = ((h0) ((ze.b) this.f5891b).f50825b).f10477a.f10594r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1019, new k3.d(k9, (String) this.f5892c, 9));
                return;
            case 14:
                int i15 = d0.f6579a;
                k3.f fVar2 = ((h0) ((ze.b) this.f5891b).f50825b).f10477a.f10594r;
                k3.a k10 = fVar2.k();
                fVar2.l(k10, 1030, new k3.d(k10, (Exception) this.f5892c, 15));
                return;
            case 15:
                ((i0) this.f5891b).run((TLRPC.Chat) this.f5892c);
                return;
            case 16:
                ((b0) this.f5891b).d((Typeface) this.f5892c);
                return;
            case 17:
                v vVar = (v) this.f5891b;
                e5 e5Var = (e5) this.f5892c;
                int i16 = vVar.f8128k;
                o2 o2Var = vVar.f8125g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                vVar.f8135r = importer;
                LongSparseArray longSparseArray = vVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    o2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (vVar.f8136s == null) {
                            hh.u uVar = new hh.u(vVar, o2Var.getParentActivity(), (jl0) e5Var.getParent(), o2Var.getResourceProvider(), vVar.f8120a);
                            vVar.f8136s = uVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar.f8135r;
                            t9 avatarImageView = e5Var.getAvatarImageView();
                            TextView textView = uVar.f8112e;
                            kh0 kh0Var = uVar.h;
                            uVar.f8115r = tL_chatInviteImporter;
                            uVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i16, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i16, user2, 1);
                            if (MessagesController.getInstance(i16).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i16).loadUserInfo(user2, false, 0);
                            }
                            kh0Var.setParentAvatarImage(avatarImageView);
                            kh0Var.M(tL_chatInviteImporter.user_id, true);
                            kh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            uVar.f8119y.requestLayout();
                            vVar.f8136s.setOnDismissListener(new cg.d0(vVar, 2));
                            vVar.f8136s.show();
                            return;
                        }
                        return;
                    }
                    vVar.f8121b = true;
                    o2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f22539id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    o2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 18:
                ih.c cVar = (ih.c) this.f5891b;
                cVar.getClass();
                ((View.OnClickListener) this.f5892c).onClick(cVar);
                return;
            case 19:
                ((s1) this.f5891b).getBulletinFactory().d0((TLRPC.TL_error) this.f5892c, false);
                return;
            case 20:
                y1 y1Var = (y1) this.f5891b;
                y1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f5892c).unsaved) {
                    y1Var.B.setVisibility(8);
                    return;
                }
                return;
            case 21:
                gr0 gr0Var = (gr0) this.f5891b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f5892c;
                gr0Var.h(tL_starGiftCollection.title, new b1(2, gr0Var, tL_starGiftCollection));
                return;
            case 22:
                AndroidUtilities.addToClipboard((String) this.f5892c);
                tc.a0(((n3) this.f5891b).f9293a.f9501a).k(false).j();
                return;
            case 23:
                k0 k0Var2 = (k0) this.f5891b;
                we.f fVar3 = (we.f) this.f5892c;
                int i17 = k0Var2.H - fVar3.f49868c;
                k0Var2.H = i17;
                if (fVar3.d) {
                    k0Var2.I = fVar3.f49869e;
                    k0Var2.J = true;
                }
                if (fVar3.f49870f) {
                    k0Var2.K = fVar3.f49871g;
                }
                if (i17 == 0) {
                    r2 r2Var = ((w1) fVar3.h).f10826a;
                    if (!k0Var2.f10582i0.f10826a.p() && r2Var.p()) {
                        k0Var2.f10584j0 = -1;
                        k0Var2.f10586k0 = 0L;
                    }
                    if (!r2Var.p()) {
                        List asList = Arrays.asList(((f2) r2Var).f10444r);
                        if (asList.size() == k0Var2.f10591o.size()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        f5.a.i(z12);
                        for (int i18 = 0; i18 < asList.size(); i18++) {
                            ((j0) k0Var2.f10591o.get(i18)).f10551b = (r2) asList.get(i18);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (k0Var2.J) {
                        if (((w1) fVar3.h).f10827b.equals(k0Var2.f10582i0.f10827b) && ((w1) fVar3.h).d == k0Var2.f10582i0.f10841r) {
                            z15 = false;
                        }
                        if (z15) {
                            if (!r2Var.p() && !((w1) fVar3.h).f10827b.a()) {
                                w1 w1Var = (w1) fVar3.h;
                                l4.c0 c0Var = w1Var.f10827b;
                                long j12 = w1Var.d;
                                Object obj = c0Var.f14262a;
                                p2 p2Var = k0Var2.f10590n;
                                r2Var.g(obj, p2Var);
                                j11 = j12 + p2Var.f10677e;
                            } else {
                                j11 = ((w1) fVar3.h).d;
                            }
                        }
                        z11 = z15;
                        j10 = j11;
                    } else {
                        j10 = -9223372036854775807L;
                        z11 = false;
                    }
                    k0Var2.J = false;
                    k0Var2.o0((w1) fVar3.h, 1, k0Var2.K, false, z11, k0Var2.I, j10, -1, false);
                    return;
                }
                return;
            case 24:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f5892c;
                ArrayList arrayList2 = ((h0) this.f5891b).f10477a.m0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((x61) ((t) obj2)).F.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 25:
                jh.y yVar2 = (jh.y) this.f5891b;
                TLObject tLObject = (TLObject) this.f5892c;
                int i19 = yVar2.f13097a;
                ArrayList arrayList3 = yVar2.f13100e;
                yVar2.f13103i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (yVar2.f13099c <= 0) {
                        arrayList3.clear();
                    }
                    yVar2.f13099c = connectedstarrefbots.count;
                    arrayList3.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList3.size() < yVar2.f13099c) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    yVar2.d = z13;
                } else {
                    yVar2.h = true;
                    yVar2.d = true;
                }
                yVar2.f13102g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(yVar2.f13098b));
                return;
            case 26:
                z zVar = (z) this.f5891b;
                TLObject tLObject2 = (TLObject) this.f5892c;
                int i20 = zVar.f13143a;
                ArrayList arrayList4 = zVar.f13146e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (zVar.f13145c <= 0) {
                        arrayList4.clear();
                    }
                    zVar.f13145c = suggestedstarrefbots.count;
                    arrayList4.addAll(suggestedstarrefbots.suggested_bots);
                    zVar.f13150j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList4.size() < zVar.f13145c) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    zVar.d = z14;
                } else {
                    zVar.f13149i = true;
                    zVar.d = true;
                }
                zVar.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(zVar.f13144b));
                return;
            case 27:
                h5.U0((h5) this.f5891b, (Long) this.f5892c);
                return;
            case 28:
                h5 h5Var = (h5) this.f5891b;
                if (!((s7) this.f5892c).f12790e) {
                    mc Q = h5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f30662t = true;
                    Q.j();
                    return;
                }
                h5Var.f12173f0.setLoading(false);
                h5Var.w1();
                return;
            default:
                ((h5) this.f5891b).getBulletinFactory().d0((TLRPC.TL_error) this.f5892c, false);
                return;
        }
    }
}
