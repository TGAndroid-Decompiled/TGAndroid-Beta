package d5;

import ag.j0;
import ag.n0;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import gh.b2;
import gh.d1;
import gh.t3;
import gh.v1;
import h3.f2;
import h3.h0;
import h3.k0;
import h3.p2;
import h3.s2;
import h3.w1;
import hh.i5;
import hh.u7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public final class u implements Runnable {

    public final int f4844a;

    public final Object f4845b;

    public final Object f4846c;

    public u(int i10, Object obj, Object obj2) {
        this.f4844a = i10;
        this.f4845b = obj;
        this.f4846c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        boolean z10;
        mc mcVarA0;
        int i10;
        int i11;
        int i12 = 2;
        int i13 = 8;
        boolean z11 = true;
        int i14 = 0;
        switch (this.f4844a) {
            case 0:
                ((com.google.android.exoplayer2.upstream.s) this.f4846c).a(((x) this.f4845b).g());
                return;
            case 1:
                dh.k kVar = (dh.k) this.f4845b;
                kVar.f5033b.add((String) this.f4846c);
                kVar.invalidate();
                return;
            case 2:
                ((v0.i) this.f4845b).onError((w0.d) this.f4846c);
                return;
            case 3:
                ((v0.i) this.f4845b).onResult((v0.f) this.f4846c);
                return;
            case 4:
                e1.d dVar = (e1.d) this.f4845b;
                v0.c cVar = (v0.c) this.f4846c;
                v0.i iVar = dVar.f5156f;
                if (iVar != null) {
                    iVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 5:
                xe.b bVar = (xe.b) this.f4845b;
                e5.x xVar = (e5.x) this.f4846c;
                h0 h0Var = (h0) bVar.f49393c;
                int i15 = g0.f4795a;
                k0 k0Var = h0Var.f7870a;
                k0Var.f7972g0 = xVar;
                k0Var.f7980l.e(25, new h3.e0(xVar));
                return;
            case 6:
                xe.b bVar2 = (xe.b) this.f4845b;
                String str = (String) this.f4846c;
                h0 h0Var2 = (h0) bVar2.f49393c;
                int i16 = g0.f4795a;
                i3.f fVar = h0Var2.f7870a.f7987r;
                i3.a aVarK = fVar.k();
                fVar.l(aVarK, 1019, new i3.d(aVarK, str, 16));
                return;
            case 7:
                xe.b bVar3 = (xe.b) this.f4845b;
                Exception exc = (Exception) this.f4846c;
                h0 h0Var3 = (h0) bVar3.f49393c;
                int i17 = g0.f4795a;
                i3.f fVar2 = h0Var3.f7870a.f7987r;
                i3.a aVarK2 = fVar2.k();
                fVar2.l(aVarK2, 1030, new i3.d(aVarK2, exc, 22));
                return;
            case 8:
                ((n0) this.f4845b).run((TLRPC.Chat) this.f4846c);
                return;
            case 9:
                fh.v vVar = (fh.v) this.f4845b;
                d5 d5Var = (d5) this.f4846c;
                int i18 = vVar.f6181k;
                n2 n2Var = vVar.f6178g;
                TLRPC.TL_chatInviteImporter importer = d5Var.getImporter();
                vVar.f6188r = importer;
                LongSparseArray longSparseArray = vVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                n2Var.getMessagesController().putUser(user, false);
                Point point = AndroidUtilities.displaySize;
                boolean z12 = point.x > point.y;
                if (user.photo == null || z12) {
                    vVar.f6174b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f22527id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                if (vVar.f6189s == null) {
                    fh.u uVar = new fh.u(vVar, n2Var.getParentActivity(), (zk0) d5Var.getParent(), n2Var.getResourceProvider(), vVar.f6173a);
                    vVar.f6189s = uVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar.f6188r;
                    n9 avatarImageView = d5Var.getAvatarImageView();
                    TextView textView = uVar.f6165e;
                    ch0 ch0Var = uVar.h;
                    uVar.f6168r = tL_chatInviteImporter;
                    uVar.v = avatarImageView;
                    TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                    if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                    }
                    ch0Var.setParentAvatarImage(avatarImageView);
                    ch0Var.M(tL_chatInviteImporter.user_id, true);
                    ch0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    uVar.f6172y.requestLayout();
                    vVar.f6189s.setOnDismissListener(new j0(vVar, 2));
                    vVar.f6189s.show();
                    return;
                }
                return;
            case 10:
                gh.c cVar2 = (gh.c) this.f4845b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.f4846c;
                cVar2.getClass();
                onClickListener.onClick(cVar2);
                return;
            case 11:
                ((v1) this.f4845b).getBulletinFactory().d0((TLRPC.TL_error) this.f4846c, false);
                return;
            case 12:
                b2 b2Var = (b2) this.f4845b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f4846c;
                b2Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                b2Var.B.setVisibility(8);
                return;
            case 13:
                wq0 wq0Var = (wq0) this.f4845b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f4846c;
                wq0Var.h(tL_starGiftCollection.title, new d1(i12, wq0Var, tL_starGiftCollection));
                return;
            case 14:
                t3 t3Var = (t3) this.f4845b;
                AndroidUtilities.addToClipboard((String) this.f4846c);
                mc.a0(t3Var.f7533a.f7197a).k(false).j();
                return;
            case 15:
                ((e0) this.f4845b).d((Typeface) this.f4846c);
                return;
            case 16:
                k0 k0Var2 = (k0) this.f4845b;
                ue.f fVar3 = (ue.f) this.f4846c;
                int i19 = k0Var2.H - fVar3.f48541c;
                k0Var2.H = i19;
                if (fVar3.d) {
                    k0Var2.I = fVar3.f48542e;
                    k0Var2.J = true;
                }
                if (fVar3.f48543f) {
                    k0Var2.K = fVar3.f48544g;
                }
                if (i19 == 0) {
                    s2 s2Var = ((w1) fVar3.h).f8220a;
                    if (!k0Var2.f7975i0.f8220a.p() && s2Var.p()) {
                        k0Var2.f7977j0 = -1;
                        k0Var2.f7979k0 = 0L;
                    }
                    if (!s2Var.p()) {
                        List listAsList = Arrays.asList(((f2) s2Var).f7837r);
                        a.i(listAsList.size() == k0Var2.f7984o.size());
                        for (int i20 = 0; i20 < listAsList.size(); i20++) {
                            ((h3.j0) k0Var2.f7984o.get(i20)).f7944b = (s2) listAsList.get(i20);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (k0Var2.J) {
                        if (((w1) fVar3.h).f8221b.equals(k0Var2.f7975i0.f8221b) && ((w1) fVar3.h).d == k0Var2.f7975i0.f8235r) {
                            z11 = false;
                        }
                        if (z11) {
                            if (s2Var.p() || ((w1) fVar3.h).f8221b.a()) {
                                j11 = ((w1) fVar3.h).d;
                            } else {
                                w1 w1Var = (w1) fVar3.h;
                                j4.c0 c0Var = w1Var.f8221b;
                                long j12 = w1Var.d;
                                Object obj = c0Var.f12503a;
                                p2 p2Var = k0Var2.f7983n;
                                s2Var.g(obj, p2Var);
                                j11 = j12 + p2Var.f8070e;
                            }
                        }
                        j10 = j11;
                        z10 = z11;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    k0Var2.J = false;
                    k0Var2.o0((w1) fVar3.h, 1, k0Var2.K, false, z10, k0Var2.I, j10, -1, false);
                    return;
                }
                return;
            case 17:
                h0 h0Var4 = (h0) this.f4845b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f4846c;
                ArrayList arrayList = h0Var4.f7870a.m0;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((m61) ((e5.s) obj2)).F.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 18:
                hh.z zVar = (hh.z) this.f4845b;
                TLObject tLObject = (TLObject) this.f4846c;
                int i21 = zVar.f10395a;
                ArrayList arrayList2 = zVar.f10398e;
                zVar.f10401i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i21).putUsers(connectedstarrefbots.users, false);
                    if (zVar.f10397c <= 0) {
                        arrayList2.clear();
                    }
                    zVar.f10397c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    zVar.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= zVar.f10397c;
                } else {
                    zVar.h = true;
                    zVar.d = true;
                }
                zVar.f10400g = false;
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(zVar.f10396b));
                return;
            case 19:
                hh.a0 a0Var = (hh.a0) this.f4845b;
                TLObject tLObject2 = (TLObject) this.f4846c;
                int i22 = a0Var.f8934a;
                ArrayList arrayList3 = a0Var.f8937e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i22).putUsers(suggestedstarrefbots.users, false);
                    if (a0Var.f8936c <= 0) {
                        arrayList3.clear();
                    }
                    a0Var.f8936c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    a0Var.f8941j = suggestedstarrefbots.next_offset;
                    a0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList3.size() >= a0Var.f8936c;
                } else {
                    a0Var.f8940i = true;
                    a0Var.d = true;
                }
                a0Var.h = false;
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(a0Var.f8935b));
                return;
            case 20:
                i5.U0((i5) this.f4845b, (Long) this.f4846c);
                return;
            case 21:
                i5 i5Var = (i5) this.f4845b;
                if (((u7) this.f4846c).f10154e) {
                    i5Var.f9461f0.setLoading(false);
                    i5Var.w1();
                    return;
                } else {
                    ec ecVarQ = i5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    ecVarQ.f28030t = true;
                    ecVarQ.j();
                    return;
                }
            case 22:
                ((i5) this.f4845b).getBulletinFactory().d0((TLRPC.TL_error) this.f4846c, false);
                return;
            case 23:
                MessagesController.getInstance(((i5) this.f4845b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f4846c), false);
                return;
            case 24:
                i5 i5Var2 = (i5) this.f4845b;
                boolean[] zArr = (boolean[]) this.f4846c;
                i5Var2.getClass();
                zArr[0] = true;
                i5Var2.f9461f0.setLoading(false);
                i5Var2.w1();
                return;
            case 25:
                i5 i5Var3 = (i5) this.f4845b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f4846c;
                i5Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 26:
                i5 i5Var4 = (i5) this.f4845b;
                mc.a0((rn) this.f4846c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(i5Var4.T))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new hh.v1(i5Var4, i13)).k(true);
                return;
            case 27:
                ((i5) this.f4845b).n2((CharSequence) this.f4846c);
                return;
            case 28:
                i5.I0((i5) this.f4845b, (TL_stars.TL_payments_uniqueStarGift) this.f4846c);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f4845b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4846c;
                b2Var2.dismiss();
                n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        mcVarA0 = mc.a0(n2VarU);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        mcVarA0 = mc.a0(n2VarU);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    y1.q(i11, mcVarA0, i10, 36);
                    return;
                }
                return;
        }
    }
}
