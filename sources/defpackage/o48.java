package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.d0;
import org.telegram.ui.e0;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
public final class o48 implements NativeLifecycleLock.NativeCallable, hf7, oj3, ea9, r42, fd, bs9, b7c, gcb, on5, bnc, bf7, f01, OnSuccessListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public o48(IOnDoneCallback iOnDoneCallback, Object obj, String str, byte b) {
        this.a = b;
        this.b = iOnDoneCallback;
        this.d = obj;
        this.c = str;
    }

    @Override
    public final void A(boolean z) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        e eVar = (e) this.c;
        xkc.l(chat, null, true, null, eVar.getParentActivity(), eVar, (k5) this.d);
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void a(String str) {
        j68 j68Var = (j68) this.b;
        o68 o68Var = j68Var.x;
        o68Var.getStoriesController().q(o68Var.l1, str, new v58(j68Var, (TL_stories.StoryItem) this.c, (x53) this.d, (byte) 2));
    }

    @Override
    public final java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o48.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        yg9 yg9Var = (yg9) this.b;
        mk0 mk0Var = (mk0) this.c;
        n12 n12Var = (n12) this.d;
        if (messageMedia != null && messageMedia.geo != null) {
            ch9 ch9Var = yg9Var.Q.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) mk0Var.b;
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                pageblockmap.w = 600;
                pageblockmap.h = 400;
            }
            ch9 ch9Var2 = yg9Var.Q.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            n12Var.a(true);
            yg9Var.Q.post(new eg9(yg9Var, mk0Var, (byte) 0));
        }
    }

    @Override
    public final void c(cnc cncVar) {
        String M0;
        mkc mkcVar = (mkc) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        dnc dncVar = (dnc) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            hl.r(mkcVar.S0);
            mkcVar.R0 = false;
            if (mkcVar.w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    M0 = ob6.M0(2131754726, null);
                } else {
                    M0 = ob6.M0(2131754725, null);
                }
                cncVar.announceForAccessibility(M0);
            }
            dncVar.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public final void mo15call() {
        h31 h31Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
        switch (b) {
            case 4:
                String str = (String) obj;
                if (obj2 == null) {
                    h31Var = null;
                } else {
                    try {
                        h31Var = new h31(obj2);
                    } catch (u31 e) {
                        androidx.car.app.utils.e.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(h31Var);
                return;
            default:
                String str2 = (String) obj;
                try {
                    iOnDoneCallback.onFailure(new h31(new FailureResponse((Exception) obj2)));
                    return;
                } catch (u31 e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e2);
                    return;
                }
        }
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((b2a) this.b).Z0((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f) {
        jja jjaVar = (jja) this.b;
        k69 k69Var = (k69) this.c;
        int[] iArr = (int[]) this.d;
        jjaVar.c(canvas, rectF, f);
        jjaVar.f(canvas, rectF, f);
        if (jjaVar.h) {
            jjaVar.b(canvas, rectF, f);
        } else {
            jjaVar.e(canvas, rectF, f);
        }
        if (k69Var != null && k69Var.b0 && k69Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            k69Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onRejoinRequested() {
        ((VoIPService) this.b).lambda$onBroadcastStateChanged$18((vc2) this.c, (NativeInstance) this.d);
    }

    @Override
    public final void onSuccess(Object obj) {
        vnb vnbVar;
        float f;
        am2 am2Var = (am2) this.b;
        Integer num = (Integer) obj;
        cc4.b("wear-auth: /answer delivered to " + ((String) am2Var.e));
        ((c51) this.c).setLoading(false);
        int i = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) am2Var.d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            if (context != null) {
                e S = LaunchActivity.S();
                if (S != null) {
                    vnbVar = S.getResourceProvider();
                } else {
                    vnbVar = null;
                }
                nx0 nx0Var = nwc.c;
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    nwc.c = null;
                }
                nx0 h = uh9.h(1, vnbVar, context, false);
                FrameLayout frameLayout = new FrameLayout(context);
                h.O = frameLayout;
                LinearLayout j = uh9.j(context, 1);
                frameLayout.addView(j, tre.e(-1, -1, 119));
                TextView b = zze.b(context, 20.0f, aob.j5, true, vnbVar);
                uh9.q(b, 17, null, 2131742578);
                j.addView(b, tre.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    lv3 f2 = pv3.f((String) arrayList.get(i2));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f2);
                    jn7.i(imageView);
                    int L = hl.L(80.0f);
                    int i3 = aob.Fi;
                    ShapeDrawable K = aob.K(L, aob.p1(0.15f, aob.v0(i3, vnbVar)));
                    uob K2 = yob.K(0.15f, i3);
                    imageView.setBackground(K);
                    yob.j(imageView, K, K2, null, vnbVar);
                    if (i2 == 0) {
                        f = 0.0f;
                    } else {
                        f = 5.0f;
                    }
                    linearLayout.addView(imageView, tre.k(f, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                j.addView(linearLayout, tre.t(-2, -2, 49, 32, 12, 32, 12));
                c51 i4 = xnb.i(24, vnbVar, context, true);
                i4.setText(ob6.M0(2131742577, null));
                j.addView(i4, tre.t(-1, 48, 7, 12, 12, 12, 8));
                int i5 = aob.a7;
                h.t0(i5);
                h.L(i5);
                nwc.c = h;
                h.show();
                i4.setOnClickListener(new ae(i4, i, h, (byte) 22));
            }
        }
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        long j;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                ArrayList arrayList2 = (ArrayList) obj2;
                zu1 zu1Var = (zu1) obj;
                PhotoViewer photoViewer = ((gb8) obj3).b;
                if (arrayList.size() <= 1 && ((if7) arrayList.get(0)).a != yac.h(photoViewer.U).e() && charSequence == null) {
                    if7 if7Var = (if7) arrayList.get(0);
                    long j3 = if7Var.a;
                    Bundle l = bs2.l("scrollToTopOnResume", true);
                    if (wf3.B(j3)) {
                        l.putInt("enc_id", (int) (j3 & 4294967295L));
                    } else if (wf3.D(j3)) {
                        l.putLong("user_id", j3);
                    } else {
                        l.putLong("chat_id", -j3);
                    }
                    zu1 zu1Var2 = new zu1(l);
                    if (if7Var.b != 0) {
                        ro4.a(zu1Var2, if7Var);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(zu1Var2, true, false)) {
                        zu1Var2.cc(arrayList2);
                    } else {
                        uj3Var.finishFragment();
                    }
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        long j4 = ((if7) arrayList.get(i3)).a;
                        if (charSequence != null) {
                            j = j4;
                            r7a.B(photoViewer.U).q0(p7a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j4;
                        }
                        r7a.B(photoViewer.U).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    uj3Var.finishFragment();
                    if (zu1Var != null) {
                        zu1Var.i6();
                        UndoView undoView = zu1Var.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((if7) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            case 3:
                cr8 cr8Var = (cr8) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uj3 uj3Var2 = (uj3) obj;
                long j5 = ((if7) arrayList.get(0)).a;
                ProfileActivity profileActivity = cr8Var.b;
                TLRPC.Chat M0 = uc7.s1(ProfileActivity.s0(profileActivity)).M0(Long.valueOf(-j5));
                if (M0 != null && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().I(M0, user, new ps0(cr8Var, j5, uj3Var2, (byte) 7));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    String M02 = ob6.M0(2131754456, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M02;
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                    idVar.U = hl.S2(ob6.a0("AddMembersAlertNamesText", null, 2131754392, lbc.r(user), str));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder.j(ob6.M0(2131754456, null), new jn1(cr8Var, j5, uj3Var, user, (byte) 7));
                    profileActivity.showDialog(idVar);
                }
                return true;
            default:
                wua wuaVar = (wua) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                uj3 uj3Var3 = (uj3) obj;
                if (arrayList.isEmpty()) {
                    return false;
                }
                long j6 = ((if7) arrayList.get(0)).a;
                Long l2 = (Long) af2.e(wuaVar.a).r.get(tL_starGiftUnique.slug);
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                if (j2 != 0 && j2 != j6) {
                    jj.k0(wuaVar.getContext(), wuaVar.J0, wuaVar.a, tL_starGiftUnique, j2, new y09(wuaVar, j6, tL_starGiftUnique, uj3Var3, (byte) 4));
                    return true;
                }
                af2.e(wuaVar.a).q(j6, new dpb(null, tL_starGiftUnique.slug), null, true);
                uj3Var3.presentFragment(zu1.ha(j6), true);
                return true;
        }
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        int i;
        zqb zqbVar = (zqb) this.b;
        ne2 ne2Var = (ne2) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        mn5 p = imageReceiver.p();
        if (z && p != null && (bitmap = p.c) != null) {
            Drawable drawable = ne2Var.b;
            if (drawable instanceof hh7) {
                hh7 hh7Var = (hh7) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i = -100;
                } else {
                    i = 100;
                }
                hh7Var.r(i, zqb.e(bitmap));
                hh7Var.s(zqbVar.M);
                zqbVar.invalidate();
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        int i2;
        e eVar;
        byte b = this.a;
        String str = null;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 7:
                xi9 xi9Var = (xi9) obj;
                String trim = ((EditTextBoldCursor) obj3).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) obj2).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    switch (xi9Var.a) {
                        case 0:
                            mi9 mi9Var = xi9Var.b;
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            mi9Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            mi9 mi9Var2 = xi9Var.b;
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            mi9Var2.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 12:
                uaa uaaVar = (uaa) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i2 = ((e) uaaVar.a).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new ol7(uaaVar, tL_authorization, (byte) 23));
                ((e9a) obj3).d.dismiss();
                return;
            case 13:
                eja ejaVar = (eja) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ((o5b) obj2).F(arrayList);
                d31.b0(ejaVar.y1).Q(2131624052, 36, ob6.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                ejaVar.E(false);
                return;
            case 16:
                ((w9b) obj3).H0((u9b) obj2, (Runnable) obj, true);
                return;
            case 17:
                d0 d0Var = (d0) obj3;
                if (aob.j0(((e0) obj2).d, (ynb) obj, true)) {
                    aob.r1(false, false);
                    znb znbVar = aob.I;
                    if (d0Var.e.f == 1) {
                        z = true;
                    }
                    aob.I1(znbVar, z, -1, null);
                    return;
                }
                return;
            case 22:
                gtc gtcVar = (gtc) obj3;
                c cVar = (c) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    cVar.c.C();
                }
                if (gtcVar.getParentLayout() != null && gtcVar.getParentLayout().getFragmentStack().size() > 1) {
                    eVar = (e) gtcVar.getParentLayout().getFragmentStack().get(gtcVar.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    eVar = null;
                }
                i18.a(cVar.a, new sb((byte) 7), null, null, null, new qo0(cVar, new ku9(gtcVar, eVar, (byte) 22), (byte) 4), false, true, new c34((rj4) null, (g25) null));
                return;
            case 23:
                c cVar2 = (c) obj2;
                l01 g = idVar.g(i, true, true);
                g.d();
                dtc dtcVar = new dtc((gtc) obj3, g, (byte) 0);
                c.P("disable backup: getting phrase...");
                cVar2.E(false, true, false, new p(cVar2, dtcVar, (z25) obj, (byte) 18));
                return;
            default:
                euc eucVar = (euc) obj3;
                f42 f42Var = (f42) obj2;
                sg2 sg2Var = (sg2) obj;
                eucVar.getClass();
                if (f42Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i3 = -eucVar.p0;
                    eucVar.p0 = i3;
                    hl.A3(i3, f42Var, null);
                    return;
                }
                String trim3 = f42Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim3)) {
                    str = trim3;
                }
                eucVar.h0 = str;
                eucVar.i0 = !sg2Var.b();
                boolean isEmpty = TextUtils.isEmpty(eucVar.h0);
                TextView textView = eucVar.Q;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(eucVar.h0);
                    eucVar.Q.setVisibility(0);
                }
                eucVar.E0();
                idVar.dismiss();
                eucVar.r0();
                return;
        }
    }

    public o48(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public final Object call() {
        RtpSender lambda$createSender$20;
        lambda$createSender$20 = ((PeerConnection) this.b).lambda$createSender$20((String) this.c, (String) this.d);
        return lambda$createSender$20;
    }
}
