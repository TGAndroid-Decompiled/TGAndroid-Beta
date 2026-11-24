package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class wt1 implements bb2 {
    public final mu1 a;

    public wt1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        mu1 mu1Var = this.a;
        if (mu1Var.ac != 0 && gb2Var.getMessageObject() != null && mu1Var.ac == gb2Var.getMessageObject().e1() && mu1Var.bc == i) {
            return true;
        }
        return false;
    }

    @Override
    public final void B0() {
        gb2 gb2Var;
        k27 messageObject;
        km m;
        mu1 mu1Var = this.a;
        if (!mu1Var.A3 && !gba.w0 && mu1Var.A0 != null && mu1Var.getParentActivity() != null && mu1Var.fragmentView != null) {
            je5 je5Var = mu1Var.I2;
            if (je5Var != null) {
                if (je5Var.W) {
                    return;
                }
            } else {
                int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
                if (indexOfChild != -1) {
                    je5 r4 = mu1Var.r4(250.0f, 3, indexOfChild + 1, false);
                    mu1Var.I2 = r4;
                    r4.d = 10000L;
                    r4.l(mu1Var.getParentActivity().getResources().getDrawable(2131232792).mutate());
                    mu1Var.I2.t(k96.M0(2131753759, null));
                } else {
                    return;
                }
            }
            int childCount = mu1Var.A0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = mu1Var.A0.getChildAt(i);
                if ((childAt instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null && k27.K4(messageObject.k) && (m = gb2Var.getPhotoImage().m()) != null && m.o() >= 3000 && !mu1Var.I2.W) {
                    ImageReceiver photoImage = gb2Var.getPhotoImage();
                    float n7 = mu1Var.n7(gb2Var, photoImage.M0);
                    float f = photoImage.O0;
                    View view = (View) gb2Var.getParent();
                    float n72 = mu1Var.n7(gb2Var, -gb2Var.getTop());
                    if (n7 <= gl.L(80.0f)) {
                        continue;
                    } else if ((n7 + f) - n72 <= (f / 4.0f) + view.getMeasuredHeight()) {
                        mu1Var.Lb = gb2Var;
                        je5 je5Var2 = mu1Var.I2;
                        je5Var2.r0 = new wl1(mu1Var, (byte) 24);
                        je5Var2.w(mu1Var.m7(gb2Var, gb2Var.getNoSoundIconCenterX()), n7, true);
                        gba.C(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        bl1 bl1Var;
        de2 de2Var;
        boolean z;
        wjb wjbVar;
        long j;
        st stVar;
        int i;
        boolean z2;
        int i2;
        ou9 ou9Var;
        int i3;
        float f;
        je5 je5Var;
        int i4;
        long j2;
        ArrayList arrayList = null;
        if (!k27Var.R4() && !k27Var.f4()) {
            if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
                if (k27Var.I3()) {
                    MediaController w = MediaController.w();
                    ArrayList G = this.a.D0.G();
                    mu1 mu1Var = this.a;
                    long j3 = mu1Var.d7;
                    boolean z3 = !mu1Var.D0.O;
                    if (mu1Var.x4) {
                        j2 = mu1Var.d();
                    } else {
                        j2 = 0;
                    }
                    return w.n0(G, k27Var, j3, z3, null, j2);
                }
            } else {
                boolean R = MediaController.w().R(k27Var);
                MediaController w2 = MediaController.w();
                if (R) {
                    arrayList = this.a.a6(k27Var, false);
                }
                w2.q0(arrayList, false);
                return R;
            }
        } else {
            qu9 qu9Var = this.a.wa;
            if (qu9Var == null || qu9Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) a.b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!k27Var.O3()) {
                            u21.b0(this.a).w(2131232792, k96.M0(2131743271, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new qu9(this.a.getParentActivity());
                qu9 qu9Var2 = this.a.wa;
                if (!k27Var.O3()) {
                    bl1Var = this.a.rb(k27Var, true);
                } else {
                    bl1Var = null;
                }
                if (!k27Var.O3()) {
                    de2Var = this.a.qb(k27Var);
                } else {
                    de2Var = null;
                }
                Activity activity = qu9Var2.a;
                st stVar2 = qu9Var2.c;
                qu9Var2.Y = bl1Var;
                qu9Var2.Z = de2Var;
                ou9 ou9Var2 = qu9Var2.O;
                if (ou9Var2 != null) {
                    stVar2.removeView(ou9Var2);
                    qu9Var2.O = null;
                }
                qu9Var2.P = gb2Var;
                k27 messageObject = gb2Var.getMessageObject();
                qu9Var2.N = messageObject;
                if (messageObject != null && messageObject.g4()) {
                    z = true;
                } else {
                    z = false;
                }
                qu9Var2.T = z;
                gb2 gb2Var2 = qu9Var2.P;
                if (gb2Var2 != null) {
                    wjbVar = gb2Var2.getResourcesProvider();
                } else {
                    wjbVar = null;
                }
                qu9Var2.M = wjbVar;
                if (qu9Var2.P != null) {
                    qu9Var2.U = 0.0f;
                    qu9Var2.V = gb2Var.n;
                    if (gb2Var.getParent() instanceof View) {
                        View view = (View) gb2Var.getParent();
                        qu9Var2.U = view.getY() + qu9Var2.U;
                        qu9Var2.V = view.getY() + qu9Var2.V;
                    }
                    int width = qu9Var2.P.getWidth();
                    int height = qu9Var2.P.getHeight();
                    if (qu9Var2.T) {
                        height = Math.min(gl.L(360.0f), Math.min(width, gl.q.y));
                    }
                    qu9Var2.L = height - qu9Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / gl.p);
                    j = 0;
                    int i5 = height;
                    stVar = stVar2;
                    ou9 ou9Var3 = new ou9(qu9Var2, qu9Var2.getContext(), y6c.t0, qu9Var2.P.getResourcesProvider(), width, i5);
                    qu9Var2.O = ou9Var3;
                    qu9Var2.P.u0(ou9Var3);
                    qu9Var2.O.t0(qu9Var2.P);
                    qu9Var2.O.setDelegate(new eef((byte) 25));
                    ou9 ou9Var4 = qu9Var2.O;
                    k27 k27Var2 = qu9Var2.N;
                    f27 currentMessagesGroup = qu9Var2.P.getCurrentMessagesGroup();
                    gb2 gb2Var3 = qu9Var2.P;
                    ou9Var4.z3(k27Var2, currentMessagesGroup, gb2Var3.G, gb2Var3.F, false, false);
                    if (!qu9Var2.T) {
                        n40 n40Var = new n40();
                        qu9Var2.W = n40Var;
                        ou9 ou9Var5 = qu9Var2.O;
                        n40Var.i = ou9Var5;
                        ou9Var5.Ic = n40Var;
                        if (ou9Var5.getSeekBarWaveform() != null) {
                            dv9 seekBarWaveform = qu9Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = qu9Var2.s;
                            gb2 gb2Var4 = seekBarWaveform.n;
                            if (gb2Var4 != null) {
                                gb2Var4.invalidate();
                            }
                        }
                    }
                    qu9Var2.I = false;
                    stVar.addView(qu9Var2.O, new FrameLayout.LayoutParams(qu9Var2.P.getWidth(), i5, 17));
                    i = ceil;
                } else {
                    j = 0;
                    stVar = stVar2;
                    i = 360;
                }
                TextureView textureView = qu9Var2.Q;
                if (textureView != null) {
                    stVar.removeView(textureView);
                    qu9Var2.Q = null;
                }
                if (qu9Var2.T) {
                    qu9Var2.R = false;
                    TextureView textureView2 = new TextureView(activity);
                    qu9Var2.Q = textureView2;
                    stVar.addView(textureView2, 0, nme.c(i, i));
                }
                lbc lbcVar = MediaController.w().j0;
                if (lbcVar != null) {
                    lbcVar.f0();
                }
                lbc lbcVar2 = qu9Var2.x;
                if (lbcVar2 != null) {
                    lbcVar2.f0();
                    qu9Var2.x.l0();
                    qu9Var2.x = null;
                }
                gb2 gb2Var5 = qu9Var2.P;
                if (gb2Var5 != null && gb2Var5.getMessageObject() != null) {
                    ba4.G(qu9Var2.P.getMessageObject().K1);
                    File I = ba4.I(qu9Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        ba4.G(qu9Var2.P.getMessageObject().K1);
                        I = ba4.M(qu9Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && qu9Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(qu9Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        lbc lbcVar3 = new lbc();
                        qu9Var2.x = lbcVar3;
                        lbcVar3.K = new u39(qu9Var2, (byte) 9);
                        if (qu9Var2.W != null) {
                            lbcVar3.L = new ln8(qu9Var2, (byte) 12);
                        }
                        if (qu9Var2.T) {
                            lbcVar3.z0(qu9Var2.Q);
                        }
                        qu9Var2.x.i0(Uri.fromFile(I), "other");
                        qu9Var2.x.g0();
                        ks3 ks3Var = qu9Var2.F;
                        if (ks3Var != null) {
                            ks3Var.s = qu9Var2.x;
                            ks3Var.a();
                        }
                    }
                    mu1 mu1Var2 = this.a;
                    mu1Var2.showDialog(mu1Var2.wa);
                    return false;
                }
                je5 je5Var2 = qu9Var2.y;
                if (je5Var2 != null) {
                    stVar.removeView(je5Var2);
                    qu9Var2.y = null;
                }
                k27 k27Var3 = qu9Var2.N;
                if (k27Var3 != null && k27Var3.O3()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                k27 k27Var4 = qu9Var2.N;
                if (k27Var4 != null && k27.B0(k27Var4.k) != y6c.h(qu9Var2.N.K1).e()) {
                    je5 je5Var3 = new je5(activity, 3);
                    qu9Var2.y = je5Var3;
                    je5Var3.p(true);
                    if (z2) {
                        long B0 = k27.B0(qu9Var2.N.k);
                        int i6 = (B0 > j ? 1 : (B0 == j ? 0 : -1));
                        k27 k27Var5 = qu9Var2.N;
                        String str = "";
                        if (i6 > 0) {
                            TLRPC.User V1 = na7.q1(k27Var5.K1).V1(Long.valueOf(B0));
                            if (V1 != null) {
                                str = l7c.k(V1, true);
                            }
                        } else {
                            TLRPC.Chat K0 = na7.q1(k27Var5.K1).K0(Long.valueOf(-B0));
                            if (K0 != null) {
                                str = K0.title;
                            }
                        }
                        je5 je5Var4 = qu9Var2.y;
                        if (qu9Var2.T) {
                            i4 = 2131743351;
                        } else {
                            i4 = 2131743272;
                        }
                        je5Var4.t(gl.T2(k96.a0(null, null, i4, str)));
                    } else {
                        je5 je5Var5 = qu9Var2.y;
                        if (qu9Var2.T) {
                            i3 = 2131743352;
                        } else {
                            i3 = 2131743273;
                        }
                        je5Var5.t(gl.T2(k96.M0(i3, null)));
                    }
                    qu9Var2.y.q(12.0f);
                    je5 je5Var6 = qu9Var2.y;
                    if (!z2 && !qu9Var2.P.G) {
                        f = 6.0f;
                    } else {
                        f = 0.0f;
                    }
                    je5Var6.setPadding(gl.L(f), 0, 0, 0);
                    boolean z4 = qu9Var2.T;
                    je5 je5Var7 = qu9Var2.y;
                    if (z4) {
                        je5Var7.o(0.5f, 0.0f);
                        je5Var = qu9Var2.y;
                        je5Var.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        je5Var7.o(0.0f, gl.L(34.0f));
                        je5Var = qu9Var2.y;
                        je5Var.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    je5Var.u(14.0f);
                    je5 je5Var8 = qu9Var2.y;
                    je5Var8.h = je5.a(je5Var8.getText(), qu9Var2.y.getTextPaint());
                    boolean z5 = qu9Var2.T;
                    je5 je5Var9 = qu9Var2.y;
                    gb2 gb2Var6 = qu9Var2.P;
                    if (z5) {
                        stVar.addView(je5Var9, nme.d((int) ((gb2Var6.getWidth() / gl.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((qu9Var2.P.getHeight() + qu9Var2.L) / gl.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        stVar.addView(je5Var9, nme.d((int) ((gb2Var6.getWidth() / gl.p) * 0.6f), 150.0f, 17, ((((qu9Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + qu9Var2.P.getBoundsLeft()) / gl.p) + 1.0f, ((-75.0f) - ((qu9Var2.P.getHeight() / gl.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    qu9Var2.y.v();
                }
                TextView textView = qu9Var2.E;
                if (textView != null) {
                    stVar.removeView(textView);
                    qu9Var2.E = null;
                }
                TextView textView2 = new TextView(activity);
                qu9Var2.E = textView2;
                textView2.setTextColor(-1);
                qu9Var2.E.setTypeface(gl.o());
                boolean o = bkb.I.o();
                TextView textView3 = qu9Var2.E;
                if (o) {
                    textView3.setBackground(bkb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    textView3.setBackground(bkb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                qu9Var2.E.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(6.0f));
                ote.a(qu9Var2.E);
                TextView textView4 = qu9Var2.E;
                if (z2) {
                    i2 = 2131743277;
                } else {
                    i2 = 2131743274;
                }
                textView4.setText(k96.M0(i2, null));
                qu9Var2.E.setOnClickListener(new lu9(qu9Var2, (byte) 1));
                stVar.addView(qu9Var2.E, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z2 && (ou9Var = qu9Var2.O) != null && ou9Var.getMessageObject() != null && qu9Var2.O.getMessageObject().k != null) {
                    qu9Var2.O.getMessageObject().k.media_unread = false;
                    qu9Var2.O.invalidate();
                }
                mu1 mu1Var22 = this.a;
                mu1Var22.showDialog(mu1Var22.wa);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
        f(gb2Var, z, false, false);
    }

    @Override
    public final void C2() {
        mu1 mu1Var = this.a;
        if (mu1Var.getUserConfig().p()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", mu1Var.l6);
            bundle.putInt("start_from", 10);
            mu1Var.presentFragment(new zj6(bundle, mu1Var.p1.getSharedMediaPreloader()));
            return;
        }
        u21.b0(mu1Var).Q(2131624212, 36, gl.O2(k96.H(',', "UnlockSimilarChannelsPremium", mu1Var.getMessagesController().k4.R1.f()), -1, 0, new ft1(this, (byte) 4), null)).j();
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i;
        int i2;
        da7 da7Var;
        Integer num;
        gl5 b;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        mu1 mu1Var = this.a;
        if (isEmpty) {
            i = ((d) mu1Var).currentAccount;
            xh8 xh8Var = new xh8(mu1Var, i, user, null, null, mu1Var.Ba);
            gb2Var.getLocationOnScreen(new int[2]);
            xh8Var.q2 = gb2Var.getNameStatusX();
            xh8Var.r2 = gb2Var.getNameStatusY();
            xh8Var.u2 = gb2Var.getScaleX();
            xh8Var.s2 = gb2Var.getLeft();
            xh8Var.t2 = gb2Var.getTop();
            xh8Var.v2 = gb2Var;
            int f = l7c.f(user);
            if (f >= 7) {
                i2 = ((d) mu1Var).currentAccount;
                ea7 ea7Var = na7.q1(i2).E3;
                if (ea7Var != null) {
                    da7Var = ea7Var.d(f);
                } else {
                    da7Var = null;
                }
                if (da7Var != null) {
                    num = Integer.valueOf(da7Var.f());
                } else {
                    num = null;
                }
                xh8Var.p2 = num;
            } else {
                xh8Var.p2 = Integer.valueOf(mu1Var.getThemedColor(bkb.q8[f]));
            }
            tl tlVar = gb2Var.Ca;
            if (tlVar != null && (tlVar.f[0] instanceof vl)) {
                xh8Var.u2 *= 0.95f;
                if (document != null) {
                    be0 be0Var = new be0(mu1Var.getParentActivity());
                    kcb d = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
                    TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = gl5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && k27.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = gl5.b(document);
                        str2 = "160_160";
                    }
                    gl5 gl5Var = b;
                    String str3 = str2;
                    be0Var.setLayerNum(7);
                    be0Var.setRoundRadius(gl.L(4.0f));
                    be0Var.j(gl5Var, str3, gl5.c(w, document), "140_140", d, document);
                    if (k27.B4(document)) {
                        Integer num2 = xh8Var.p2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = mu1Var.getThemedColor(bkb.u6);
                        }
                        be0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        xh8Var.x2 = k27.i1(document);
                    } else {
                        xh8Var.x2 = k27.i1(document);
                    }
                    xh8Var.w2 = be0Var;
                    xh8Var.z2 = true;
                }
            }
            mu1Var.showDialog(xh8Var);
            return;
        }
        d01.t(mu1Var.getParentActivity(), "https://" + mu1Var.getMessagesController().N2 + "/nft/" + str);
    }

    @Override
    public final boolean D0(defpackage.gb2 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.D0(gb2, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void D1(h27 h27Var) {
        StaticLayout staticLayout = h27Var.e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = h27Var.e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new nj2(h27Var.L, charSequence, false), 0, spannableString.length(), 33);
            gl.g(spannableString);
            u21.b0(this.a).i(k96.M0(2131752010, null)).j();
        }
    }

    @Override
    public final void E(gb2 gb2Var) {
        k27 messageObject;
        if (gb2Var != null && (messageObject = gb2Var.getMessageObject()) != null && messageObject.k != null) {
            int e1 = messageObject.e1();
            mu1 mu1Var = this.a;
            if (mu1Var.ac != e1 || mu1Var.bc != 7) {
                TLRPC.InputPeer h1 = mu1Var.getMessagesController().h1(k27.B0(messageObject.k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = h1;
                getrichmessage.id = e1;
                c01 c01Var = mu1Var.ec;
                if (c01Var != null) {
                    c01Var.a(true);
                    mu1Var.ec = null;
                }
                pp1 pp1Var = new pp1(mu1Var, e1, gb2Var, (byte) 2);
                pp1Var.b = new aj1(mu1Var, r3, (byte) 10);
                mu1Var.ec = pp1Var;
                pp1Var.d();
                int[] iArr = {mu1Var.getConnectionsManager().sendRequestTyped(getrichmessage, new hc((byte) 0), new jl1(mu1Var, pp1Var, iArr, gb2Var, messageObject, (byte) 2))};
            }
        }
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
        Bundle k = ls6.k(j, "user_id");
        d dVar = this.a;
        if (dVar.getMessagesController().A(k, dVar, gb2Var.getMessageObject(), null)) {
            dVar.presentFragment(new mu1(k));
        }
    }

    @Override
    public final gib E2() {
        return this.a.u9;
    }

    @Override
    public final boolean F(defpackage.gb2 r40, org.telegram.tgnet.TLRPC.TodoItem r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.F(gb2, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        int i;
        k27 messageObject;
        TLRPC.Message message;
        if (gb2Var != null) {
            mu1 mu1Var = this.a;
            if (mu1Var.getParentActivity() != null) {
                i = ((d) mu1Var).currentAccount;
                if (na7.q1(i).u4() && (messageObject = gb2Var.getMessageObject()) != null && (message = messageObject.k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(mu1Var.e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
        TLRPC.WebPage webPage;
        int i2;
        int i3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String M0;
        int i4;
        TLRPC.User user2;
        int i5;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z;
        k27 messageObject = gb2Var.getMessageObject();
        boolean z2 = false;
        pt1 pt1Var = null;
        pt1 pt1Var2 = null;
        File file = null;
        pt1 pt1Var3 = null;
        pt1 pt1Var4 = null;
        if (i == 19) {
            c01 c01Var = this.a.ec;
            if (c01Var != null) {
                c01Var.a(true);
            }
            mu1 mu1Var = this.a;
            if (gb2Var.getMessageObject() != null) {
                pt1Var2 = new pt1(this, gb2Var, (byte) 2);
            }
            mu1Var.ec = pt1Var2;
            mu1 mu1Var2 = this.a;
            final c01 c01Var2 = mu1Var2.ec;
            final Activity parentActivity = mu1Var2.getParentActivity();
            final wjb resourceProvider = this.a.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c01Var2.d();
            c01Var2.b = new tm0(atomicBoolean, (byte) 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b = ym0.b(messageObject);
            TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-messageObject.Z0()));
            if (K0 != null && hc2.V(K0)) {
                z = true;
            } else {
                z = false;
            }
            final long j = messageObject.k.date * 1000;
            on0.e(messageObject, new p8c(atomicBoolean, c01Var2, z, b, j, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean a;
                public final c01 b;
                public final boolean c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Activity f;
                public final wjb g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.a.get()) {
                        this.b.b();
                        boolean z3 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z4 = this.c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Activity activity = this.f;
                        wjb wjbVar = this.g;
                        if (z3) {
                            ym0.d(z4, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, wjbVar);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            ym0.e(z4, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, wjbVar);
                        }
                    }
                }
            }, new vm0(atomicBoolean, c01Var2, (byte) 0));
        } else if (i == 21) {
            a.t();
            boolean z3 = w01.a;
            a.q();
            d01.t(this.a.getParentActivity(), w01.g);
        } else if (i == 84) {
            this.a.ya(gb2Var);
        } else if (i == 80) {
            mu1 mu1Var3 = this.a;
            pm pmVar = gf8.L1;
            if (mu1Var3.getParentActivity() != null) {
                mu1Var3.showDialog(new gf8(mu1Var3.getContext(), mu1Var3.getCurrentAccount(), messageObject, mu1Var3.getResourceProvider()));
            }
        } else if (i == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                    this.a.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i == 5) {
            long j2 = messageObject.k.media.user_id;
            if (j2 != 0) {
                i5 = ((d) this.a).currentAccount;
                user2 = na7.q1(i5).V1(Long.valueOf(j2));
            } else {
                user2 = null;
            }
            mu1 mu1Var4 = this.a;
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                mu1Var4.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File f1 = gl.f1();
                    f1.mkdirs();
                    file = new File(f1, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                mu1Var4.showDialog(new b48(mu1Var4, null, user2, null, file, p38.h(str, false), str3, str4, mu1Var4.Ba));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else if (i == 30) {
            this.a.presentFragment(new mu1(ls6.k(messageObject.k.media.user_id, "user_id")));
        } else if (i == 31) {
            long j3 = messageObject.k.media.user_id;
            if (j3 != 0) {
                i4 = ((d) this.a).currentAccount;
                user = na7.q1(i4).V1(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    M0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = yjb.k(new StringBuilder("+"), user.phone, p38.f());
                } else {
                    String str5 = k27.n1(messageObject.k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        M0 = p38.f().e(str5);
                    } else {
                        M0 = k96.M0(2131747639, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                this.a.presentFragment(new it2(bundle2));
            }
        } else if (i != 23 && i != 24) {
            if (messageObject.q4()) {
                this.a.M9(messageObject, false, false);
                if (messageObject.T0 != null) {
                    c01 c01Var3 = this.a.ec;
                    if (c01Var3 != null) {
                        c01Var3.a(true);
                    }
                    mu1 mu1Var5 = this.a;
                    if (gb2Var.getMessageObject() != null) {
                        pt1Var3 = new pt1(this, gb2Var, (byte) 4);
                    }
                    mu1Var5.ec = pt1Var3;
                    Activity parentActivity2 = this.a.getParentActivity();
                    Uri parse = Uri.parse(messageObject.T0);
                    mu1 mu1Var6 = this.a;
                    d01.s(parentActivity2, parse, true, false, false, mu1Var6.ec, null, false, mu1Var6.getMessagesController().k4.A2.f, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
                W1 = messageMedia2.webpage;
            }
            TLRPC.WebPage webPage3 = W1;
            if (webPage3 != null) {
                if (webPage3.attributes != null) {
                    for (int i6 = 0; i6 < webPage3.attributes.size(); i6++) {
                        if ((webPage3.attributes.get(i6) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPage3.attributes.get(i6)).storyItem) != null) {
                            storyItem.dialogId = cf3.n(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), tL_webPageAttributeStory.storyItem, p2b.a(this.a.A0));
                            return;
                        }
                    }
                }
                if (!this.a.ha(webPage3.url, gb2Var, null, messageObject.e1(), 2)) {
                    c01 c01Var4 = this.a.ec;
                    if (c01Var4 != null) {
                        c01Var4.a(true);
                    }
                    mu1 mu1Var7 = this.a;
                    if (gb2Var.getMessageObject() != null) {
                        pt1Var4 = new pt1(this, gb2Var, (byte) 5);
                    }
                    mu1Var7.ec = pt1Var4;
                    d01.s(this.a.getParentActivity(), Uri.parse(webPage3.url), true, true, false, this.a.ec, null, false, true, false, false);
                }
            }
        } else {
            if (i == 24) {
                z2 = true;
            }
            TLRPC.Message message2 = messageObject.k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                c01 c01Var5 = this.a.ec;
                if (c01Var5 != null) {
                    c01Var5.a(true);
                }
                mu1 mu1Var8 = this.a;
                if (gb2Var.getMessageObject() != null) {
                    pt1Var = new pt1(this, gb2Var, (byte) 3);
                }
                mu1Var8.ec = pt1Var;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i2 = ((d) this.a).currentAccount;
                    if (hq6.d0(i2).q0(group) == null) {
                        this.a.ec.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i3 = ((d) this.a).currentAccount;
                        this.a.ec.b = new eg(this, ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickerSet, new i81((byte) 1, this, z2)), (byte) 21);
                        return;
                    }
                }
                d01.s(this.a.getParentActivity(), Uri.parse(webPage.url), true, true, false, this.a.ec, null, false, true, false, false);
            }
        }
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
        f(gb2Var, z, false, z2);
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
        int i;
        if (gb2Var != null && document != null) {
            mu1 mu1Var = this.a;
            if (mu1Var.getParentLayout() != null && l2(gb2Var)) {
                boolean J3 = k27.J3(document);
                gb2Var.setScrimBlockBounds(rectF);
                cs5 I = cs5.I(mu1Var, gb2Var);
                if (J3) {
                    i = 2131745719;
                } else {
                    i = 2131745739;
                }
                I.b(2131232119, k96.M0(i, null), new jn1(this, gb2Var, document, (byte) 6), false);
                I.p = new jt1(gb2Var, rectF, (byte) 0);
                I.a0();
            }
        }
    }

    @Override
    public final void H2(gb2 gb2Var) {
        this.a.za(gb2Var);
    }

    @Override
    public final void I(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.Message message = messageObject.k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.f6(true);
        mu1 mu1Var = this.a;
        mu1Var.getMessagesStorage().U1(k27.B0(messageObject.k), messageObject.k);
        mu1Var.getMessagesController().i4.g(messageObject, true, false);
        f(gb2Var, true, false, true);
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        try {
            mu1 mu1Var = this.a;
            ou3.I0(mu1Var, k27Var, mu1Var.db, str2, str3, str4, str, i, i2, -1, mu1Var.O7());
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override
    public final boolean J0(long j) {
        TLRPC.ChatFull L0;
        mu1 mu1Var = this.a;
        TLRPC.Chat chat = mu1Var.e;
        if (chat == null || hc2.V(chat)) {
            return false;
        }
        na7 messagesController = mu1Var.getMessagesController();
        long j2 = mu1Var.e.id;
        if (j2 == j) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j2));
        if (messagesController.getUserConfig().e() == j && K0 != null && K0.creator) {
            return true;
        }
        vf6 vf6Var = (vf6) messagesController.q1.f(j2);
        if (vf6Var == null && (L0 = messagesController.L0(j2)) != null && L0.participants != null) {
            for (int i = 0; i < L0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(i);
                if (chatParticipant.user_id == j) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) vf6Var.f(j)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        Uri parse;
        boolean z2;
        st1 st1Var;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z && d01.i(str, false, false)) {
            z2 = true;
        } else {
            z2 = z;
        }
        mu1 mu1Var = this.a;
        c01 c01Var = mu1Var.ec;
        if (c01Var != null) {
            c01Var.a(true);
        }
        if (gb2Var.getMessageObject() == null) {
            st1Var = null;
        } else {
            st1Var = new st1(this, gb2Var);
        }
        mu1Var.ec = st1Var;
        if (!z2 && !d01.g(parse, false, null)) {
            ij.o0(mu1Var, str, true, true, true, !z2, mu1Var.ec, webPage, mu1Var.Ba);
        } else {
            d01.s(mu1Var.getParentActivity(), parse, true, true, false, mu1Var.ec, null, false, true, false, false);
        }
    }

    @Override
    public final void M(defpackage.gb2 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.M(gb2, int, float, float, boolean):void");
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
        f(gb2Var, z, true, false);
    }

    @Override
    public final void M1(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().f(messageObject);
        }
    }

    @Override
    public final boolean N() {
        SparseArray[] sparseArrayArr = this.a.o6;
        if (sparseArrayArr[1].size() + sparseArrayArr[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void N0(defpackage.gb2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.N0(gb2):void");
    }

    @Override
    public final boolean N1() {
        mu1 mu1Var = this.a;
        if (mu1Var.m1.getKeyboardHeight() + mu1Var.La >= gl.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        this.a.d6(characterStyle, z, gb2Var.getMessageObject(), gb2Var);
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
        TLRPC.Message message;
        int i;
        int i2;
        int i3;
        int L;
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            byte b = iq0Var.a;
            TL_stars.StarsAmount starsAmount = null;
            mu1 mu1Var = this.a;
            if (b == 1) {
                long n = cf3.n(message.from_id);
                x0 x0Var = new x0(this, message, (byte) 28);
                Pattern pattern = ij.a;
                Activity parentActivity = mu1Var.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, parentActivity);
                String M0 = k96.M0(2131744146, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = gl.T2(k96.a0(null, null, 2131744145, na7.q1(y6c.t0).y1(n, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                zkb.X(editText, bkb.F6, null);
                editText.setHint(k96.M0(2131744144, null));
                zkb.D(editText, bkb.G6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(bkb.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new zi(parentActivity)});
                if (k96.a0) {
                    i3 = gl.L(24.0f);
                } else {
                    i3 = 0;
                }
                int L2 = gl.L(8.0f);
                if (k96.a0) {
                    L = 0;
                } else {
                    L = gl.L(24.0f);
                }
                editText.setPadding(i3, L2, L, gl.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.j(k96.M0(2131751592, null), new o(x0Var, editText, (byte) 4));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.O = new ve(editText, (byte) 0);
                frameLayout.addView(editText, nme.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                gl.e3(new b1(editText, (byte) 11), 100L);
                mu1Var.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                }
            } else if (b == 2) {
                if (message.suggested_post != null) {
                    i = ((d) mu1Var).currentAccount;
                    boolean A = hc2.A(i, mu1Var.e, 24);
                    if (A) {
                        i2 = ((d) mu1Var).currentAccount;
                        hc2.A(i2, mu1Var.e, 5);
                    }
                    qg qgVar = new qg(this, message, A, messageObject, (byte) 6);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    mu1Var.l5(qgVar, nj.m(starsAmount), !A);
                }
            } else if (b == 3) {
                mu1Var.Q5(gb2Var, true, false, gb2Var.getLastTouchX(), gb2Var.getLastTouchY(), true, false, true);
            } else if (b == 4) {
                mu1Var.g2.k(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final boolean P() {
        mu1 mu1Var = this.a;
        if (!l7c.A(mu1Var.f) && !l7c.C(mu1Var.f)) {
            return false;
        }
        return true;
    }

    @Override
    public final int Q() {
        return this.a.g4;
    }

    @Override
    public final void R1() {
        wjb wjbVar;
        mu1 mu1Var = this.a;
        if (mu1Var.m1 != null && mu1Var.getParentActivity() != null) {
            Context context = mu1Var.m1.getContext();
            wjbVar = ((d) mu1Var).resourceProvider;
            cb9.Y0(context, mu1Var, false, wjbVar, null);
        }
    }

    @Override
    public final void S(gb2 gb2Var) {
        k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Lc(primaryMessageObject, false);
    }

    @Override
    public final boolean T0(gb2 gb2Var, final TLRPC.TodoItem todoItem, final boolean z) {
        TLRPC.Peer peer;
        int i;
        TLRPC.Peer peer2;
        int i2;
        boolean l3 = k27.l3(gb2Var.getMessageObject().k);
        mu1 mu1Var = this.a;
        if (l3) {
            TLRPC.Message message = gb2Var.getMessageObject().k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long n = cf3.n(peer2);
            u21 b0 = u21.b0(mu1Var);
            i2 = ((d) mu1Var).currentAccount;
            b0.Q(2131624113, 36, gl.T2(k96.a0(null, null, 2131743846, cf3.k(i2, n)))).k(true);
            return false;
        } else if (!gb2Var.getMessageObject().q()) {
            TLRPC.Message message2 = gb2Var.getMessageObject().k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long n2 = cf3.n(peer);
            u21 b02 = u21.b0(mu1Var);
            i = ((d) mu1Var).currentAccount;
            b02.Q(2131624113, 36, gl.T2(k96.a0(null, null, 2131743847, cf3.k(i, n2)))).k(true);
            return false;
        } else if (!mu1Var.getUserConfig().p()) {
            u21.b0(mu1Var).Q(2131624212, 36, gl.O2(k96.M0(2131743823, null), -1, 2, new ft1(this, (byte) 9), null)).k(true);
            return false;
        } else {
            final long M = hc2.M(mu1Var.e, mu1Var.r8, true);
            final z3a sendMessagesHelper = mu1Var.getSendMessagesHelper();
            final k27 messageObject = gb2Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(k27.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().h1(k27.B0(messageObject.k));
            if (z) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    z3a z3aVar = z3a.this;
                    final boolean z2 = z;
                    if (tL_error == null) {
                        final ad7 messagesStorage = z3aVar.getMessagesStorage();
                        k27 k27Var = messageObject;
                        final long B0 = k27.B0(k27Var.k);
                        final int e1 = k27Var.e1();
                        final int i3 = todoItem.id;
                        final long e = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        co3 co3Var = messagesStorage.a;
                        final long j = M;
                        co3Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ec7.run():void");
                            }
                        });
                        z3aVar.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    }
                    gl.d3(new z54(z3aVar, hash, z2, (byte) 3));
                }
            });
            return true;
        }
    }

    @Override
    public final boolean T1(gm gmVar) {
        TLRPC.InputStickerSet i1;
        int i;
        mu1 mu1Var = this.a;
        if (!mu1Var.getMessagesController().E3() && gmVar != null && !gmVar.standard) {
            long documentId = gmVar.getDocumentId();
            TLRPC.Document document = gmVar.document;
            if (document == null) {
                i = ((d) mu1Var).currentAccount;
                document = vl.e(i, documentId);
            }
            if (document != null && (i1 = k27.i1(document)) != null) {
                hq6.d0(y6c.t0).n0(i1, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i1);
                qx3 qx3Var = new qx3(mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
                hx3 hx3Var = qx3Var.p1;
                hx3Var.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(hx3Var);
                hx3Var.w = imageReceiver;
                if (hx3Var.d) {
                    imageReceiver.I();
                }
                hx3Var.x = true;
                hx3Var.y.e(true, 1.0f);
                hx3Var.w.Z(gl5.b(document), "140_140", gl5.c(ba4.w(document.thumbs, 90, false, null, false), document), "140_140", uo3.d(document.thumbs, bkb.l6, 0.2f, true), 0L, null, null, 0);
                hx3Var.w.m0(7);
                ImageReceiver imageReceiver2 = hx3Var.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.M(1);
                ImageReceiver imageReceiver3 = hx3Var.w;
                imageReceiver3.x0 = true;
                imageReceiver3.p0(hx3Var);
                boolean O7 = mu1Var.O7();
                qx3Var.i0 = O7;
                qx3Var.n = O7;
                mu1Var.showDialog(qx3Var);
                return true;
            }
        }
        return false;
    }

    @Override
    public final int U(gb2 gb2Var) {
        jd8 jd8Var;
        mu1 mu1Var = this.a;
        if (mu1Var.ed.f && (jd8Var = mu1Var.kd) != null && jd8Var.n == gb2Var && jd8Var.a.getWidth() > 0) {
            return mu1Var.kd.a.getHeight();
        }
        return 0;
    }

    @Override
    public final void V(gb2 gb2Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() != null) {
            if (mu1Var.ua == null) {
                wx8 wx8Var = new wx8(mu1Var.getParentActivity());
                mu1Var.ua = wx8Var;
                mu1Var.m1.addView(wx8Var, nme.e(-1, -1, 48));
            }
            wx8 wx8Var2 = mu1Var.ua;
            HashMap hashMap = wx8Var2.a;
            ArrayList arrayList = wx8Var2.c;
            arrayList.clear();
            int i = wx8Var2.d;
            y6c h = y6c.h(i);
            long j = h.n;
            arrayList.add(Long.valueOf(j));
            if (h.W) {
                ArrayList arrayList2 = hq6.d0(i).j1;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j2 = tL_topPeer.peer.user_id;
                    if (j2 != 0 && na7.q1(i).V1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = na7.q1(i).y;
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i3);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j3 = dialog.id;
                    if (j3 != j && !cf3.B(j3)) {
                        if (cf3.D(dialog.id)) {
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(dialog.id));
                            if (V1 != null && !l7c.u(V1) && !l7c.y(V1) && !l7c.B(V1.id)) {
                                int i4 = dialog.folder_id;
                                long j4 = dialog.id;
                                if (i4 == 1) {
                                    arrayList3.add(Long.valueOf(j4));
                                } else {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        } else {
                            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-dialog.id));
                            if (K0 != null && !K0.forum && !hc2.r0(K0) && ((!K0.gigagroup || hc2.N(K0)) && (!hc2.T(K0) || K0.creator || (((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_messages) || K0.megagroup)))) {
                                int i5 = dialog.folder_id;
                                long j5 = dialog.id;
                                if (i5 == 1) {
                                    arrayList3.add(Long.valueOf(j5));
                                } else {
                                    arrayList.add(Long.valueOf(j5));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b = wx8.b(gb2Var);
            if (b != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    Long l = (Long) obj2;
                    if (hashSet.add(l) && cf3.D(l.longValue())) {
                        arrayList5.add(l);
                    }
                }
                vx8 vx8Var = new vx8(wx8Var2, gb2Var, arrayList5, new lw8(wx8Var2, b, (byte) 5));
                vx8Var.setBounds(0, 0, wx8Var2.getMeasuredWidth(), wx8Var2.getMeasuredHeight());
                vx8Var.setCallback(wx8Var2);
                if (!hashMap.containsKey(b)) {
                    hashMap.put(b, vx8Var);
                }
            }
        }
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        mu1 mu1Var = this.a;
        if (!mu1Var.Q7()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (mu1Var.getParentActivity() != null) {
                if (mu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    ar1 ar1Var = mu1Var.a0;
                    k27 messageObject = gb2Var.getMessageObject();
                    k27 messageObject2 = gb2Var.getMessageObject();
                    op1 op1Var = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    c01 c01Var = mu1Var.ec;
                    if (c01Var != null) {
                        c01Var.a(true);
                        mu1Var.ec = null;
                    }
                    if (str != null && gb2Var.getMessageObject() != null) {
                        op1Var = new op1(mu1Var, gb2Var.getMessageObject().e1(), str, gb2Var, (byte) 1);
                        mu1Var.ec = op1Var;
                    } else {
                        mu1Var.ec = null;
                    }
                    ar1Var.s0(keyboardButtonProto, messageObject, messageObject2, op1Var);
                }
            }
        }
    }

    @Override
    public final vu1 W() {
        return this.a.uc;
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
        ui5 ui5Var;
        ui5 ui5Var2;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() != null && tLObject != null) {
            ui5Var = ((d) mu1Var).parentLayout;
            if (ui5Var != null) {
                ui5Var2 = ((d) mu1Var).parentLayout;
                if (((ActionBarLayout) ui5Var2).w()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z2 = tLObject instanceof TLRPC.Chat;
            if (z2) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else {
                return;
            }
            if (z && z2) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232572, 2, mu1Var.getResourceProvider(), mu1Var.getParentActivity());
                zkb.h(bkb.F8, mu1Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
                a8 a8Var = new a8(mu1Var.getParentActivity(), false, false);
                a8Var.j(k96.M0(2131747618, null), 2131232093, null);
                a8Var.setMinimumWidth(160);
                a8Var.setOnClickListener(new x91(this, (byte) 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                a8 a8Var2 = new a8(mu1Var.getParentActivity(), false, false);
                a8Var2.j(k96.M0(2131746469, null), 2131232049, null);
                a8Var2.setMinimumWidth(160);
                a8Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, gb2Var, (byte) 19));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
                mu1 mu1Var2 = new mu1(bundle);
                mu1Var2.ga = true;
                mu1Var.presentFragmentAsPreviewWithMenu(mu1Var2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                mu1Var.i5();
                return;
            }
            mu1Var.presentFragment(new mu1(bundle));
        }
    }

    @Override
    public final void X(k27 k27Var) {
        this.a.s.put(k27Var, Boolean.TRUE);
    }

    @Override
    public final void X0(gb2 gb2Var) {
        int i;
        int i2;
        mq1 mq1Var;
        k27 primaryMessageObject = gb2Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.c3 = !primaryMessageObject.c3;
            primaryMessageObject.M1 = true;
            mu1 mu1Var = this.a;
            jq1 jq1Var = mu1Var.A0;
            if (jq1Var != null && (mq1Var = mu1Var.C0) != null && mq1Var.y < 0) {
                for (int childCount = jq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = mu1Var.A0.getChildAt(childCount);
                    mu1Var.A0.getClass();
                    i = RecyclerView.R(childAt);
                    if (i >= 0) {
                        if (childAt instanceof gb2) {
                            if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                                i2 = mu1Var.Y6(childAt);
                                break;
                            }
                        } else if (childAt instanceof uk1) {
                            i2 = mu1Var.Y6(childAt);
                            break;
                        }
                    }
                }
            }
            i = -1;
            i2 = 0;
            mu1Var.Lc(primaryMessageObject, false);
            je5 je5Var = mu1Var.P1;
            if (je5Var != null) {
                je5Var.f(true);
            }
            if (i >= 0 && gb2Var.getCurrentMessagesGroup() == null) {
                mu1Var.C0.g1(i, i2);
            }
        }
    }

    @Override
    public final void X1(gb2 gb2Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull L0;
        TLRPC.User currentUser = gb2Var.getCurrentUser();
        mu1 mu1Var = this.a;
        if (gl.C1(mu1Var.getParentActivity()) && (chat = mu1Var.e) != null && currentUser != null && !hc2.V(chat)) {
            na7 messagesController = mu1Var.getMessagesController();
            long j = mu1Var.e.id;
            long j2 = currentUser.id;
            vf6 vf6Var = (vf6) messagesController.q1.f(j);
            if (vf6Var == null && (L0 = messagesController.L0(j)) != null && L0.participants != null) {
                for (int i = 0; i < L0.participants.participants.size(); i++) {
                    chatParticipant = L0.participants.participants.get(i);
                    if (chatParticipant.user_id == j2) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) vf6Var.f(j2);
            e(gb2Var, chatParticipant);
        }
    }

    @Override
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        pp1 pp1Var;
        int i;
        on7 on7Var;
        k27 messageObject = gb2Var.getMessageObject();
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            mu1 mu1Var = this.a;
            c01 c01Var = mu1Var.ec;
            if (c01Var != null) {
                c01Var.a(true);
                mu1Var.ec = null;
            }
            if (gb2Var.getMessageObject() == null) {
                mu1Var.ec = null;
                pp1Var = null;
            } else {
                pp1Var = new pp1(mu1Var, gb2Var.getMessageObject().e1(), gb2Var, (byte) 1);
                mu1Var.ec = pp1Var;
            }
            i = ((d) this.a).currentAccount;
            gta v = gta.v(i, false);
            Objects.requireNonNull(pp1Var);
            hq1 hq1Var = new hq1(pp1Var, (byte) 4);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            wjb F = gta.F();
            if (messageObject != null && context != null) {
                long B0 = k27.B0(messageObject.k);
                int e1 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = na7.q1(v.a).h1(B0);
                tL_inputInvoiceMessage.msg_id = e1;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u = ow0.u(F, false);
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                on7Var = new on7(v, ConnectionsManager.getInstance(v.a).sendRequest(tL_payments_getPaymentForm, new rt0(v, messageObject, tL_inputInvoiceMessage, hq1Var, (byte) 21)), (byte) 15);
            } else {
                on7Var = null;
            }
            if (on7Var != null) {
                pp1Var.b = on7Var;
                pp1Var.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.k;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i2 = -1;
            for (int i3 = 0; i3 < tL_messageMediaPaidMedia.extended_media.size(); i3++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i3);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i2 = arrayList.size();
                    }
                    TLRPC.TL_message H5 = mu1.H5(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        H5.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        H5.attachPath = message.attachPath;
                    }
                    H5.media = tL_messageExtendedMedia.media;
                    H5.noforwards = true;
                    arrayList.add(new k27(messageObject.K1, H5, false, true));
                }
            }
            if (i2 > -1 && !arrayList.isEmpty()) {
                PhotoViewer r0 = PhotoViewer.r0();
                mu1 mu1Var2 = this.a;
                r0.S1(null, mu1Var2, mu1Var2.Ba);
                PhotoViewer.r0().i1(arrayList, i2, this.a.a(), 0L, 0L, this.a.eb);
            }
        }
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
        this.a.Q5(gb2Var, true, false, f, f2, false, false, false);
    }

    @Override
    public final void Y1(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        mu1 mu1Var = this.a;
        mu1Var.v5 = messageObject;
        mu1Var.t7();
    }

    @Override
    public final ma8 Z1() {
        return this.a.Ta;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        mu1 mu1Var = this.a;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            CharSequence fieldText = ar1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = hc2.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                mu1Var.a0.setFieldText(spannableStringBuilder);
                gl.e3(new ft1(this, (byte) 6), 200L);
            }
        }
    }

    @Override
    public final boolean b() {
        org.telegram.ui.ActionBar.a aVar;
        org.telegram.ui.ActionBar.a aVar2;
        boolean z;
        mu1 mu1Var = this.a;
        aVar = ((d) mu1Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) mu1Var).actionBar;
            if (!aVar2.y() && !mu1Var.R7()) {
                z = ((d) mu1Var).inPreviewMode;
                if (!z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
        org.telegram.ui.ActionBar.a aVar;
        mu1 mu1Var = this.a;
        aVar = ((d) mu1Var).actionBar;
        boolean z = true;
        if (!aVar.y() && !mu1Var.R7()) {
            if (gb2Var != null && gb2Var.getMessageObject() != null && gb2Var.getMessageObject().q4()) {
                F1(gb2Var, 10);
                return;
            }
            if (!hc2.c0(mu1Var.e) && !mu1Var.Y7()) {
                z = false;
            }
            k(user, z);
            return;
        }
        mu1Var.Fa(gb2Var, f, f2, true);
    }

    @Override
    public final String b1(gb2 gb2Var) {
        mu1 mu1Var;
        int i;
        if (gb2Var.getMessageObject() != null && (i = (mu1Var = this.a).ac) != 0 && i == gb2Var.getMessageObject().e1() && mu1Var.bc == 3) {
            return mu1Var.dc;
        }
        return null;
    }

    @Override
    public final void b2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new nj2(str2, str, false), 0, spannableString.length(), 33);
        gl.g(spannableString);
        u21.b0(this.a).i(k96.M0(2131752010, null)).j();
    }

    @Override
    public final void c() {
        this.a.m1.getClass();
    }

    @Override
    public final void c0(int i) {
        CharSequence O2;
        int i2;
        SpannableStringBuilder T2;
        int i3;
        mu1 mu1Var = this.a;
        try {
            if (i == 0) {
                mu1Var.m5();
                xr1 xr1Var = mu1Var.O3;
                if (xr1Var != null) {
                    xr1Var.l(0L, 84, null, new ft1(this, (byte) 1));
                    mu1Var.O3.performHapticFeedback(3, 2);
                }
            } else if (i == 1) {
                String x = k96.x(mu1Var.getMessagesController().H3, true);
                if (mu1Var.getMessagesController().H3 > 0) {
                    i3 = ((d) mu1Var).currentAccount;
                    T2 = gl.T2(k96.G(uyb.g(i3), "TranscriptionTrialLeftUntil", x));
                } else {
                    i2 = ((d) mu1Var).currentAccount;
                    T2 = gl.T2(k96.G(uyb.g(i2), "TranscriptionTrialLeft", new Object[0]));
                }
                u21.b0(mu1Var).G(2131624295, 6, T2).k(true);
                mu1Var.fragmentView.performHapticFeedback(3, 2);
            } else if (i == 2 || i == 3) {
                String x2 = k96.x(mu1Var.getMessagesController().H3, true);
                u21 b0 = u21.b0(mu1Var);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) gl.T2(k96.G(mu1Var.getMessagesController().G3, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i == 2) {
                    O2 = gl.O2(k96.M0(2131743729, null), -1, 0, new ft1(this, (byte) 2), null);
                } else if (mu1Var.getMessagesController().H3 <= 0) {
                    O2 = "";
                } else {
                    O2 = gl.O2(k96.a0(null, null, 2131743728, x2), -1, 0, new ft1(this, (byte) 3), null);
                }
                SpannableStringBuilder append2 = append.append(O2);
                b0.getClass();
                t11 t11Var = new t11(b0.X(), b0.c);
                t11Var.c(2131624295, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i4 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i4 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i4++;
                    }
                }
                t11Var.b.setText(append2);
                t11Var.b.setSingleLine(false);
                t11Var.b.setMaxLines(6);
                b0.b(t11Var, 7000).k(true);
                pw0.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void c1(gb2 gb2Var) {
        float f;
        if (gb2Var.getMessageObject().y3()) {
            i1();
            return;
        }
        mu1 mu1Var = this.a;
        if (!mu1Var.A3 && mu1Var.A0 != null && mu1Var.getParentActivity() != null && mu1Var.fragmentView != null) {
            if (mu1Var.J2 == null) {
                int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
                if (indexOfChild != -1) {
                    je5 r4 = mu1Var.r4(250.0f, 3, indexOfChild + 1, false);
                    mu1Var.J2 = r4;
                    r4.t(k96.M0(2131749137, null));
                } else {
                    return;
                }
            }
            k27 messageObject = gb2Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = gb2Var.getCurrentUser();
                if (currentUser != null && currentUser.id == 0) {
                    f = (gb2Var.getMeasuredHeight() - Math.max(0, gb2Var.getBottom() - ((View) gb2Var.getParent()).getMeasuredHeight())) - gl.L(50.0f);
                } else {
                    float L = gl.L(22.0f);
                    if (!messageObject.O3() && gb2Var.w9 && gb2Var.h9 != null) {
                        f = gl.L(20.0f) + L;
                    } else {
                        f = L;
                    }
                }
                if (mu1Var.n7(gb2Var, f) > gl.L(80.0f)) {
                    mu1Var.J2.w(mu1Var.m7(gb2Var, gb2Var.getForwardNameCenterX()), mu1Var.n7(gb2Var, f) - gl.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final boolean c2(long r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.c2(long):boolean");
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        mu1 mu1Var = this.a;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            CharSequence fieldText = ar1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String o = l7c.o(user);
            if (o != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) o).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(tb4.o(l7c.k(user, false), " "));
                spannableString.setSpan(new j4c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            mu1Var.a0.setFieldText(spannableStringBuilder);
            gl.e3(new ft1(this, (byte) 7), 200L);
        }
    }

    @Override
    public final boolean d0() {
        if (this.a.g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
        TLRPC.Message message;
        if (gb2Var == null) {
            k08Var.run();
            return;
        }
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null && ((!messageObject.n4() || messageObject.Y2()) && (message = messageObject.k) != null && message.rich_message != null)) {
            d dVar = this.a;
            dVar.getSendMessagesHelper().u(messageObject, messageObject.k.rich_message, null, dVar, true);
            return;
        }
        k08Var.run();
    }

    public final void e(gb2 gb2Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        wjb wjbVar;
        TLRPC.User currentUser = gb2Var.getCurrentUser();
        mu1 mu1Var = this.a;
        mu1Var.getUserConfig().f();
        if (gl.C1(mu1Var.getParentActivity()) && (chat = mu1Var.e) != null && currentUser != null && !hc2.V(chat)) {
            boolean z4 = true;
            boolean z5 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z = false;
                    z5 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == mu1Var.getUserConfig().e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                    z4 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z2 = false;
                    z5 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == mu1Var.getUserConfig().e()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    z4 = false;
                }
                str2 = channelParticipant2.rank;
                z3 = z2;
                boolean z6 = z4;
                boolean z7 = z5;
                Activity parentActivity = mu1Var.getParentActivity();
                i = ((d) mu1Var).currentAccount;
                wjbVar = ((d) mu1Var).resourceProvider;
                wfb.b(parentActivity, i, -mu1Var.e.id, currentUser, str2, z6, z7, z3, wjbVar);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z = false;
                    z5 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == mu1Var.getUserConfig().e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                    z4 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (hc2.T(mu1Var.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                mu1Var.getMessagesController();
                tL_channels_getParticipant.channel = na7.g1(mu1Var.e);
                tL_channels_getParticipant.participant = mu1Var.getMessagesController().h1(currentUser.id);
                mu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new hc((byte) 0), new ae2(this, gb2Var, (byte) 7));
                return;
            } else {
                return;
            }
            z3 = z;
            str2 = str;
            boolean z62 = z4;
            boolean z72 = z5;
            Activity parentActivity2 = mu1Var.getParentActivity();
            i = ((d) mu1Var).currentAccount;
            wjbVar = ((d) mu1Var).resourceProvider;
            wfb.b(parentActivity2, i, -mu1Var.e.id, currentUser, str2, z62, z72, z3, wjbVar);
        }
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        mu1 mu1Var;
        int i;
        if (gb2Var.getMessageObject() != null && (i = (mu1Var = this.a).ac) != 0 && i == gb2Var.getMessageObject().e1() && mu1Var.bc == 1) {
            return mu1Var.cc;
        }
        return null;
    }

    @Override
    public final void e2(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.X5();
            messageObject.M1 = true;
            gb2Var.J1();
            gb2Var.requestLayout();
            this.a.D0.M(messageObject, false, false);
        }
    }

    public final void f(gb2 gb2Var, boolean z, boolean z2, boolean z3) {
        k27 primaryMessageObject;
        int i;
        int i2;
        mq1 mq1Var;
        if (gb2Var == null || (primaryMessageObject = gb2Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        mu1 mu1Var = this.a;
        jq1 jq1Var = mu1Var.A0;
        if (jq1Var != null && (mq1Var = mu1Var.C0) != null && mq1Var.y < 0) {
            for (int childCount = jq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = mu1Var.A0.getChildAt(childCount);
                mu1Var.A0.getClass();
                i = RecyclerView.R(childAt);
                if (i >= 0) {
                    if (childAt instanceof gb2) {
                        if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                            i2 = mu1Var.Y6(childAt);
                            break;
                        }
                    } else if (childAt instanceof uk1) {
                        i2 = mu1Var.Y6(childAt);
                        break;
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        if (z && i >= 0 && gb2Var.getCurrentMessagesGroup() == null) {
            mq1 mq1Var2 = mu1Var.C0;
            if (z3) {
                mu1Var.A0.getClass();
                mq1Var2.h1(RecyclerView.R(gb2Var), gb2Var.getTop() - ((int) mu1Var.P9), false);
            } else {
                mq1Var2.g1(i, i2);
            }
        }
        mu1Var.c1 = z2;
        mu1Var.Lc(primaryMessageObject, false);
        mu1Var.c1 = false;
    }

    public final boolean g() {
        mu1 mu1Var = this.a;
        if (!l7c.C(mu1Var.f)) {
            TLRPC.Chat chat = mu1Var.e;
            if (chat != null) {
                if (hc2.T(chat) && !mu1Var.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return !this.a.s.containsKey(k27Var);
    }

    public final void h(gb2 gb2Var, TLRPC.Chat chat, int i, boolean z) {
        mu1 mu1Var = this.a;
        TLRPC.Chat chat2 = mu1Var.e;
        if (chat2 != null) {
            long j = chat.id;
            long j2 = chat2.id;
            if (j == j2) {
                cq1 cq1Var = mu1Var.p1;
                if (cq1Var != null && i == 0) {
                    cq1Var.e(false, false);
                    return;
                } else if (gb2Var.getMessageObject() != null) {
                    mu1Var.J(i, gb2Var.getMessageObject().e1(), 0, 0, true, false);
                    return;
                } else {
                    return;
                }
            } else if (j == j2 && !mu1Var.Y7()) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i != 0) {
            bundle.putInt("message_id", i);
        }
        pp1 pp1Var = null;
        if (z) {
            c01 c01Var = mu1Var.ec;
            if (c01Var != null) {
                c01Var.a(true);
                mu1Var.ec = null;
            }
            if (gb2Var != null && gb2Var.getMessageObject() != null) {
                pp1 pp1Var2 = new pp1(mu1Var, gb2Var.getMessageObject().e1(), gb2Var, (byte) 0);
                mu1Var.ec = pp1Var2;
                pp1Var = pp1Var2;
            } else {
                mu1Var.ec = null;
            }
        }
        if (mu1Var.getMessagesController().A(bundle, mu1Var, gb2Var.getMessageObject(), pp1Var)) {
            mu1 mu1Var2 = new mu1(bundle);
            if (pp1Var != null && i != 0) {
                pp1 pp1Var3 = pp1Var;
                gl.e3(new i57(this, pp1Var3, chat, i, mu1Var2, (byte) 9), 5000L);
                pp1Var3.d();
                return;
            }
            mu1Var.presentFragment(mu1Var2);
        }
    }

    @Override
    public final boolean h0() {
        boolean z;
        mu1 mu1Var = this.a;
        if (!mu1Var.R7()) {
            z = ((d) mu1Var).inPreviewMode;
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        k27 messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (gb2Var != null && pageBlock != null) {
            mu1 mu1Var = this.a;
            if (mu1Var.getParentActivity() != null && (messageObject = gb2Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i = 0; i < arrayList2.size(); i++) {
                    mg9 mg9Var = (mg9) arrayList2.get(i);
                    if (mg9Var instanceof ah9) {
                        arrayList.add(((ah9) mg9Var).r0);
                    } else if (mg9Var instanceof mh9) {
                        arrayList.add(((mh9) mg9Var).r0);
                    } else if (mg9Var instanceof sg9) {
                        ArrayList arrayList3 = ((sg9) mg9Var).Y;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            arrayList.add(((gg9) obj).b);
                        }
                    } else if (mg9Var instanceof eh9) {
                        ArrayList arrayList4 = ((eh9) mg9Var).Y;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((gg9) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.S1(null, mu1Var, null);
                    return r0.m1(null, null, null, null, null, null, null, indexOf, new dt1(mu1Var, arrayList), null, 0L, 0L, 0L, true, new ct1(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void i(gb2 gb2Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            d dVar = this.a;
            if (dVar.getMessagesController().A(bundle, dVar, gb2Var.getMessageObject(), null)) {
                dVar.presentFragment(new mu1(bundle));
            }
        }
    }

    @Override
    public final void i0(k27 k27Var) {
        if (k27.K4(k27Var.k)) {
            this.a.rb(k27Var, true);
        }
    }

    @Override
    public final void i1() {
        mu1 mu1Var = this.a;
        mu1Var.Z5();
        UndoView undoView = mu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, mu1Var.l6, null);
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        k27 messageObject;
        if (chat == null) {
            return;
        }
        mu1 mu1Var = this.a;
        aVar = ((d) mu1Var).actionBar;
        if (!aVar.y() && !mu1Var.R7()) {
            if (!z && chat.signature_profiles && (messageObject = gb2Var.getMessageObject()) != null && k27.B0(messageObject.k) != 1271266957) {
                mu1Var.sa(cf3.n(messageObject.k.from_id));
                return;
            } else {
                h(gb2Var, chat, i, z);
                return;
            }
        }
        mu1Var.Fa(gb2Var, f, f2, true);
    }

    public final void j(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        mu1 mu1Var = this.a;
        mu1Var.getSendMessagesHelper().m0(true, gb2Var.getMessageObject(), keyboardInlineButton, null, null, mu1Var);
    }

    public final void k(TLRPC.User user, boolean z) {
        int i;
        if (user != null && user.id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i2 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("expandPhoto", z);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            mu1 mu1Var = this.a;
            TLRPC.User user2 = mu1Var.f;
            if (user2 != null && user2.id == user.id) {
                i2 = 1;
            }
            profileActivity.x3(i2);
            Activity parentActivity = mu1Var.getParentActivity();
            i = ((d) mu1Var).classGuid;
            gl.h3(parentActivity, i);
            mu1Var.presentFragment(profileActivity);
        }
    }

    @Override
    public final void k0(String str) {
        mu1 mu1Var = this.a;
        er1 er1Var = mu1Var.d1;
        if (er1Var == null || er1Var.getVisibility() != 0) {
            dr1 dr1Var = mu1Var.T;
            if ((dr1Var == null || dr1Var.getVisibility() != 0) && mu1Var.a0 != null && str != null && str.length() > 0) {
                ar1 ar1Var = mu1Var.a0;
                ar1Var.setFieldText("@" + str + " ");
                mu1Var.a0.h1();
            }
        }
    }

    @Override
    public final boolean k2(gb2 gb2Var, final TLRPC.User user) {
        ?? r2;
        ?? r4;
        char c;
        int i;
        wb0 b;
        int i2;
        er1 er1Var;
        dr1 dr1Var;
        if (!g()) {
            return false;
        }
        mu1 mu1Var = this.a;
        if (mu1Var.e != null && (((er1Var = mu1Var.d1) == null || er1Var.getVisibility() != 0) && ((dr1Var = mu1Var.T) == null || dr1Var.getVisibility() != 0))) {
            r2 = 1;
        } else {
            r2 = 0;
        }
        TLRPC.Chat chat = mu1Var.e;
        if (chat != null && ((mu1Var.s4 == 0 || mu1Var.x4) && (!hc2.T(chat) || mu1Var.e.megagroup))) {
            r4 = 1;
        } else {
            r4 = 0;
        }
        cc0[] cc0VarArr = new cc0[r2 + 2 + r4];
        cc0VarArr[0] = cc0.d;
        cc0VarArr[1] = cc0.h;
        if (r2 != 0) {
            cc0VarArr[2] = cc0.n;
            c = 3;
        } else {
            c = 2;
        }
        if (r4 != 0) {
            cc0VarArr[c] = cc0.r;
        }
        TLRPC.UserFull W1 = mu1Var.getMessagesController().W1(user.id);
        if (W1 == null) {
            i = ((d) mu1Var).classGuid;
            b = wb0.b(user, i, cc0VarArr);
        } else {
            b = wb0.c(user, W1, cc0VarArr);
            if (!xf4.i(b)) {
                i2 = ((d) mu1Var).classGuid;
                b = wb0.b(user, i2, cc0VarArr);
            }
        }
        if (xf4.i(b)) {
            xf4.t().J((ViewGroup) mu1Var.fragmentView, mu1Var.Ba, b, new ie(this, gb2Var, user, (byte) 15));
            return true;
        }
        cs5 I = cs5.I(mu1Var, gb2Var);
        I.b(2131232271, k96.M0(2131747593, null), new Runnable(this) {
            public final wt1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                wt1 wt1Var = this.b;
                switch (b2) {
                    case 0:
                        wt1Var.k(user2, false);
                        return;
                    case 1:
                        wt1Var.d(user2);
                        return;
                    default:
                        wt1Var.a.qa(user2);
                        return;
                }
            }
        }, false);
        I.b(2131232118, k96.M0(2131745409, null), new jn1(this, gb2Var, user, (byte) 4), false);
        I.k(2131232227, k96.M0(2131748417, null), new Runnable(this) {
            public final wt1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                wt1 wt1Var = this.b;
                switch (b2) {
                    case 0:
                        wt1Var.k(user2, false);
                        return;
                    case 1:
                        wt1Var.d(user2);
                        return;
                    default:
                        wt1Var.a.qa(user2);
                        return;
                }
            }
        }, r2);
        I.k(2131232359, k96.M0(2131753755, null), new Runnable(this) {
            public final wt1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                wt1 wt1Var = this.b;
                switch (b2) {
                    case 0:
                        wt1Var.k(user2, false);
                        return;
                    case 1:
                        wt1Var.d(user2);
                        return;
                    default:
                        wt1Var.a.qa(user2);
                        return;
                }
            }
        }, r4);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gl.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l0(gb2 gb2Var, int i) {
        boolean z = gb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        mu1 mu1Var = this.a;
        if (z) {
            long j = -((TLRPC.TL_messageMediaGiveaway) gb2Var.getMessageObject().k.media).channels.get(i).longValue();
            if (mu1Var.l6 != j) {
                mu1Var.presentFragment(mu1.U9(j));
            } else {
                mu1Var.p1.e(false, false);
            }
        }
        if (gb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            mu1Var.presentFragment(ProfileActivity.P2(((TLRPC.TL_messageMediaGiveawayResults) gb2Var.getMessageObject().k.media).winners.get(i).longValue()));
        }
    }

    @Override
    public final void l1(gb2 gb2Var) {
        mu1 mu1Var = this.a;
        if (!mu1Var.getMessagesController().X4()) {
            hd hdVar = new hd(3, null, mu1Var.getParentActivity());
            hdVar.q(200L);
            mu1Var.getMessagesController().P0(new ht(this, hdVar, gb2Var, (byte) 11));
            return;
        }
        if (gb2Var.getMessageObject() != null) {
            gb2Var.getMessageObject().t2 = Boolean.FALSE;
        }
        gb2Var.K3();
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        k27 messageObject;
        if (gb2Var == null) {
            messageObject = null;
        } else {
            messageObject = gb2Var.getMessageObject();
        }
        if (messageObject != null && messageObject.k != null) {
            mu1 mu1Var = this.a;
            if (mu1Var.g4 != 1 && !mu1Var.P7() && !messageObject.k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.f6(gb2Var, reactionCount, z, f, f2);
    }

    @Override
    public final void n1(gb2 gb2Var) {
        k27 k27Var;
        long j;
        int i;
        ArrayList arrayList;
        de2 de2Var;
        f27 f27Var;
        int i2;
        mu1 mu1Var = this.a;
        wx8 wx8Var = mu1Var.ua;
        if (wx8Var != null) {
            HashMap hashMap = wx8Var.a;
            vx8 vx8Var = (vx8) hashMap.get(wx8.b(gb2Var));
            m21 m21Var = null;
            if (vx8Var != null) {
                k27Var = vx8Var.F;
            } else {
                k27Var = null;
            }
            vx8 vx8Var2 = (vx8) mu1Var.ua.a.get(wx8.b(gb2Var));
            if (vx8Var2 != null && (i2 = vx8Var2.S) != -1) {
                j = vx8Var2.x[i2].d;
            } else {
                j = 0;
            }
            if (k27Var != null && j != 0) {
                Activity parentActivity = mu1Var.getParentActivity();
                i = ((d) mu1Var).currentAccount;
                boolean z = false;
                if (!ij.h(parentActivity, i, j, false)) {
                    if (k27Var.c1() != 0 && (f27Var = (f27) mu1Var.P6.f(k27Var.c1())) != null) {
                        arrayList = f27Var.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = tb4.t(k27Var);
                    }
                    if (j == y6c.h(y6c.t0).n) {
                        z = true;
                    }
                    long j2 = j;
                    de2 de2Var2 = new de2(this, arrayList, j2, (byte) 15);
                    if (z) {
                        de2Var2.run();
                        de2Var = null;
                    } else {
                        de2Var = de2Var2;
                    }
                    m21Var = u21.v(mu1Var.getParentActivity(), mu1Var, null, 1, j2, 1, mu1Var.getThemedColor(bkb.vj), mu1Var.getThemedColor(bkb.xj), 5000, false, de2Var);
                    m21Var.k = true;
                    m21Var.k(m21Var.e instanceof x11);
                }
            }
            vx8 vx8Var3 = (vx8) hashMap.get(wx8.b(gb2Var));
            if (vx8Var3 != null) {
                if (m21Var == null) {
                    vx8Var3.S = -1;
                    vx8Var3.c();
                    return;
                }
                q11 q11Var = m21Var.e;
                if (!(q11Var instanceof t11)) {
                    vx8Var3.c();
                    return;
                }
                t11 t11Var = (t11) q11Var;
                vx8Var3.X = t11Var;
                t11Var.a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = vx8Var3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ni3(vx8Var3, viewTreeObserver, (byte) 2));
            }
        }
    }

    @Override
    public final void p() {
        a.t();
        boolean z = w01.a;
        a.q();
        d01.t(this.a.getParentActivity(), w01.g);
    }

    @Override
    public final void q(gb2 gb2Var) {
        mu1 mu1Var = this.a;
        mu1Var.getNotificationCenter().k(kk7.o3, Long.valueOf(mu1Var.l6), gb2Var);
    }

    @Override
    public final void q0(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = k96.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = k96.M0(2131746401, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            k27.d(spannableStringBuilder, false);
            f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
            mu1 mu1Var = this.a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.e;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if ((((c27) arrayList.get(i)).l & 1) != 0) {
                        k27 k27Var = (k27) currentMessagesGroup.d.get(i);
                        if (k27Var != messageObject) {
                            int childCount = mu1Var.A0.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = mu1Var.A0.getChildAt(i2);
                                if (childAt instanceof gb2) {
                                    gb2 gb2Var2 = (gb2) childAt;
                                    if (k27Var.T(gb2Var2.getMessageObject())) {
                                        gb2Var = gb2Var2;
                                    }
                                }
                            }
                            messageObject = k27Var;
                        }
                    } else {
                        i++;
                    }
                }
            }
            mu1Var.Xb(messageObject, spannableStringBuilder, 1);
            gb2Var.J3(1, false, true);
        }
    }

    @Override
    public final void q1(defpackage.gb2 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.q1(gb2):void");
    }

    @Override
    public final boolean r0(defpackage.gb2 r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.r0(gb2, boolean):boolean");
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null) {
            int a = ye8.a(messageObject);
            boolean a2 = fod.a(a, 7);
            mu1 mu1Var = this.a;
            if (a2) {
                u21.b0(mu1Var).Q(2131624007, 36, ye8.b(a, messageObject)).j();
            } else if (i < 0 && !arrayList.isEmpty()) {
                mu1Var.getSendMessagesHelper().v0(messageObject, arrayList, null);
                gb2Var.c0(true);
            } else if (mu1Var.getParentActivity() != null) {
                if (mu1Var.C2 == null) {
                    int indexOfChild = mu1Var.m1.indexOfChild(mu1Var.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    je5 r4 = mu1Var.r4(250.0f, 3, indexOfChild + 1, false);
                    mu1Var.C2 = r4;
                    r4.v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i < 0) {
                    ArrayList<fb2> pollButtons = gb2Var.getPollButtons();
                    int size = pollButtons.size();
                    int i4 = 0;
                    float f = 0.0f;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        fb2 fb2Var = pollButtons.get(i4);
                        float y = ((gb2Var.getY() + fb2Var.b) - gl.L(4.0f)) - mu1Var.P9;
                        mu1Var.F2 = gl.L(13.3f) + fb2Var.a;
                        int z = b00.z(6.0f, fb2Var.b, i3);
                        mu1Var.G2 = z;
                        if (y > 0.0f) {
                            i2 = mu1Var.F2;
                            i3 = z;
                            f = 0.0f;
                            break;
                        }
                        i4++;
                        f = y;
                    }
                    if (f != 0.0f) {
                        mu1Var.A0.x0(0, (int) f, null);
                        mu1Var.E2 = gb2Var;
                        return;
                    }
                }
                mu1Var.cc(gb2Var, i, i2, i3);
            }
        }
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Document document;
        int i3;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i4;
        TLRPC.Document document3;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        long j3;
        int i8;
        boolean z;
        boolean z2;
        int i9;
        wjb wjbVar;
        wjb wjbVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k27.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                K1(gb2Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            mu1 mu1Var = this.a;
            if (geoPoint != null) {
                if (gl.H1(mu1Var)) {
                    qa6 qa6Var = new qa6(3);
                    wjbVar2 = ((d) mu1Var).resourceProvider;
                    qa6Var.setResourceProvider(wjbVar2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = mu1Var.getMessagesController().w1(mu1Var.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    qa6Var.V0 = false;
                    qa6Var.F0(new k27(y6c.t0, tL_message, false, false));
                    mu1Var.presentFragment(qa6Var);
                }
            } else if (k27.N2(messageMedia.document)) {
                xv2.e().l(mu1Var.getParentActivity());
                xv2.e().k(new ut1(this, tL_messageMediaPoll, pollAnswer, gb2Var));
                xv2 e = xv2.e();
                TLRPC.Document document4 = messageMedia.document;
                if (k27.H2(document4)) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                k27 messageObject2 = gb2Var.getMessageObject();
                wjbVar = ((d) mu1Var).resourceProvider;
                e.i(document4, null, "", null, null, i9, false, messageObject2, wjbVar, 200);
            } else if (k27.J3(messageMedia.document)) {
                k27 k27Var = MediaController.w().v0;
                if (MediaController.w().D(messageObject) && k27Var != null) {
                    boolean z3 = k27Var.m0;
                    if (i == -3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3 == z2) {
                        if (MediaController.w().C()) {
                            MediaController.w().R(k27Var);
                            return;
                        } else {
                            MediaController.w().Q(k27Var, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.k;
                TLRPC.TL_message H5 = mu1.H5(message);
                H5.media = messageMedia;
                H5.attachPath = ud8.c(i, message);
                ArrayList arrayList = new ArrayList();
                i8 = ((d) mu1Var).currentAccount;
                k27 k27Var2 = new k27(i8, H5, false, true);
                if (i == -3) {
                    z = true;
                } else {
                    z = false;
                }
                k27Var2.m0 = z;
                arrayList.add(k27Var2);
                if (MediaController.w().D(messageObject)) {
                    MediaController.w().l(false, true, false, false);
                }
                MediaController.w().n0(arrayList, k27Var2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !k27.J4(document5)) {
                    i6 = ((d) mu1Var).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    bb4 bb4Var = new bb4(i6, messageObject, document6, ud8.c(i, messageObject.k));
                    if (bb4Var.g) {
                        ba4.G(i6).f(document6);
                        bb4Var.a();
                        gb2Var.b0();
                        return;
                    } else if (!bb4Var.f) {
                        ba4.G(i6).X(document6, messageObject, 2, 0);
                        bb4Var.a();
                        gb2Var.b0();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.k;
                        TLRPC.TL_message H52 = mu1.H5(message2);
                        H52.media = messageMedia;
                        H52.attachPath = ud8.c(i, message2);
                        i7 = ((d) mu1Var).currentAccount;
                        k27 k27Var3 = new k27(i7, H52, false, true);
                        if (k27.y(messageMedia.document)) {
                            PhotoViewer.r0().S1(null, mu1Var, mu1Var.Ba);
                            PhotoViewer r0 = PhotoViewer.r0();
                            if (k27Var3.D != 0) {
                                j = mu1Var.l6;
                                j2 = mu1Var.d7;
                                j3 = mu1Var.d();
                            } else {
                                j = 0;
                                j2 = 0;
                                j3 = 0;
                            }
                            r0.l1(k27Var3, mu1Var, j, j2, j3, mu1Var.db);
                            return;
                        }
                        try {
                            gl.r2(k27Var3, mu1Var.getParentActivity(), mu1Var.Ba, false);
                            return;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            mu1Var.z4(k27Var3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k27.J4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i2 = arrayList3.size();
                    } else {
                        i2 = -1;
                    }
                    TLRPC.TL_message H53 = mu1.H5(message3);
                    H53.media = messageMedia3;
                    H53.attachPath = ud8.c(-2, message3);
                    i5 = ((d) mu1Var).currentAccount;
                    arrayList3.add(new k27(i5, H53, false, true));
                    arrayList2.add(-2);
                } else {
                    i2 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k27.J4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i2 = arrayList3.size();
                    }
                    TLRPC.TL_message H54 = mu1.H5(message3);
                    H54.media = messageMedia2;
                    H54.attachPath = ud8.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    H54.message = pollResults2.solution;
                    H54.entities = pollResults2.solution_entities;
                    i4 = ((d) mu1Var).currentAccount;
                    arrayList3.add(new k27(i4, H54, false, true));
                    arrayList2.add(-3);
                }
                apb.b(tL_messageMediaPoll.poll, mu1Var.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                int i10 = i2;
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i11);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k27.J4(document))) {
                        if (pollAnswer2.unshuffled_index == i) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message H55 = mu1.H5(message3);
                        H55.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        H55.message = tL_textWithEntities2.text;
                        H55.entities = tL_textWithEntities2.entities;
                        H55.attachPath = ud8.c(pollAnswer2.unshuffled_index, message3);
                        i3 = ((d) mu1Var).currentAccount;
                        arrayList3.add(new k27(i3, H55, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.s0 = arrayList2;
                    PhotoViewer.r0().S1(null, mu1Var, mu1Var.Ba);
                    PhotoViewer.r0().i1(arrayList3, i10, mu1Var.a(), 0L, 0L, mu1Var.eb);
                }
            }
        }
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
        k27 messageObject = gb2Var.getMessageObject();
        int i = messageObject.D;
        mu1 mu1Var = this.a;
        if (i == 16) {
            TLRPC.MessageAction messageAction = messageObject.k.action;
            int i2 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(mu1Var.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i2 < size) {
                    TLRPC.Peer peer = arrayList.get(i2);
                    i2++;
                    hashSet.add(Long.valueOf(cf3.n(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                hd hdVar = new hd(3, null, mu1Var.getParentActivity());
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = mu1Var.getMessagesController().k4.w3.f();
                hdVar.setOnCancelListener(new xs0(this, mu1Var.getConnectionsManager().sendRequest(getgroupcall, new fn0(this, hdVar, hashSet, tL_inputGroupCallInviteMessage, messageObject, (byte) 5)), (byte) 2));
                hdVar.q(600L);
                return;
            }
            TLRPC.User user = mu1Var.f;
            if (user != null) {
                boolean I4 = messageObject.I4();
                TLRPC.UserFull userFull = mu1Var.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i2 = 1;
                }
                rgc.m(user, I4, i2, mu1Var.getParentActivity(), mu1Var.getMessagesController().W1(mu1Var.f.id), mu1Var.getAccountInstance());
                return;
            }
            return;
        }
        mu1Var.Q5(gb2Var, true, false, f, f2, messageObject.I3(), false, false);
    }

    @Override
    public final void t() {
        this.a.pc();
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        mu1 mu1Var = this.a;
        if (!mu1Var.Q7()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (mu1Var.getParentActivity() != null) {
                if (mu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        fx0 fx0Var = new fx0(1, (wjb) mu1Var.Ba, (Context) mu1Var.getParentActivity(), false);
                        fx0Var.K();
                        fx0Var.P = str;
                        fx0Var.Q = false;
                        fx0Var.R = true;
                        CharSequence[] charSequenceArr = {k96.M0(2131751755, null)};
                        fe feVar = new fe(mu1Var, str, (byte) 3);
                        fx0Var.M = charSequenceArr;
                        fx0Var.L = feVar;
                        mu1Var.showDialog(fx0Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        mu1Var.ca(null, tL_inlineButtonTypeUrl.url, true, gb2Var, gb2Var.getMessageObject());
                        try {
                            gb2Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void u2() {
        this.a.G7();
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
        k27 messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        mu1 mu1Var = this.a;
        je5 je5Var = mu1Var.P1;
        if (je5Var != null) {
            je5Var.f(true);
        }
        if (mu1Var.getParentActivity() != null && (messageObject = gb2Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(k96.D0().y);
            } catch (Exception e) {
                fa4.g(e, true);
                str = R0.country;
            }
            je5 je5Var2 = new je5(mu1Var.getParentActivity(), 3);
            je5Var2.p(true);
            je5Var2.L = Layout.Alignment.ALIGN_NORMAL;
            je5Var2.d = -1L;
            je5Var2.U = true;
            je5Var2.e = true;
            je5Var2.q(12.0f);
            mu1Var.P1 = je5Var2;
            je5Var2.r0 = new aj1(this, je5Var2, (byte) 22);
            je5Var2.t(gl.T2(k96.a0(null, null, 2131750836, str)));
            mu1Var.P1.k(mu1Var.L);
            mu1Var.m1.addView(mu1Var.P1, nme.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            mu1Var.m1.post(new mp1(this, gb2Var, i2, i, (byte) 2));
        }
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
        vx8 vx8Var;
        int i;
        boolean z;
        boolean z2;
        float f3;
        wx8 wx8Var = this.a.ua;
        if (wx8Var != null && (vx8Var = (vx8) wx8Var.a.get(wx8.b(gb2Var))) != null) {
            sx8[] sx8VarArr = vx8Var.x;
            RectF rectF = vx8Var.r;
            if (vx8Var.N) {
                float f4 = (f - rectF.left) + vx8Var.V;
                float f5 = (f2 - rectF.top) + vx8Var.W;
                int floor = (int) Math.floor((f4 - (gl.L(9.0f) - (gl.L(11.0f) / 2.0f))) / gl.L(53.0f));
                if ((-gl.L(37.0f)) < f5 && f5 < rectF.height()) {
                    i = moe.b(floor, 0, sx8VarArr.length - 1);
                } else {
                    i = -1;
                }
                if (vx8Var.S != i) {
                    vx8Var.a.performHapticFeedback(3, 1);
                    vx8Var.S = i;
                    for (int i2 = 0; i2 < sx8VarArr.length; i2++) {
                        sx8 sx8Var = sx8VarArr[i2];
                        if (i == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f6 = 1.0f;
                        if (sx8Var.p != z) {
                            ValueAnimator valueAnimator = sx8Var.n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            sx8Var.p = z;
                            float f7 = sx8Var.o;
                            if (z) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f3);
                            sx8Var.n = ofFloat;
                            ofFloat.setDuration(180L);
                            sx8Var.n.addUpdateListener(sx8Var);
                            sx8Var.n.setInterpolator(ux8.a);
                            sx8Var.n.start();
                        }
                        sx8 sx8Var2 = sx8VarArr[i2];
                        if (i != i2 && i != -1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (sx8Var2.m != z2) {
                            ValueAnimator valueAnimator2 = sx8Var2.k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            sx8Var2.m = z2;
                            float f8 = sx8Var2.l;
                            if (!z2) {
                                f6 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f8, f6);
                            sx8Var2.k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            sx8Var2.k.addUpdateListener(sx8Var2);
                            sx8Var2.k.setInterpolator(ux8.a);
                            sx8Var2.k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void v2(gb2 gb2Var) {
        mu1 mu1Var = this.a;
        mu1Var.Ua.k(gb2Var, mu1Var, true);
        mu1Var.A0.J0(false);
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z;
        int i6;
        int i7;
        String str2;
        boolean z2;
        wb0 wb0Var;
        int i8;
        int i9;
        cc0 cc0Var;
        er1 er1Var;
        dr1 dr1Var;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(hc2.K(chat, false));
        mu1 mu1Var = this.a;
        if (!isEmpty && mu1Var.e != null && (((er1Var = mu1Var.d1) == null || er1Var.getVisibility() != 0) && ((dr1Var = mu1Var.T) == null || dr1Var.getVisibility() != 0))) {
            i = 1;
        } else {
            i = 0;
        }
        TLRPC.Chat chat2 = mu1Var.e;
        if (chat2 != null && ((mu1Var.s4 == 0 || mu1Var.x4) && (!hc2.T(chat2) || mu1Var.e.megagroup))) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TLRPC.Chat chat3 = mu1Var.e;
        if (chat3 != null && chat3.id == chat.id && !mu1Var.Y7()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        cc0[] cc0VarArr = new cc0[i3 + 1 + i + i2];
        cc0VarArr[0] = cc0.d;
        if (i3 != 0) {
            if (chat.broadcast) {
                cc0Var = cc0.e;
            } else {
                cc0Var = cc0.f;
            }
            cc0VarArr[1] = cc0Var;
            i4 = 2;
        } else {
            i4 = 1;
        }
        if (i != 0) {
            cc0VarArr[i4] = cc0.n;
            i4++;
        }
        if (i2 != 0) {
            cc0VarArr[i4] = cc0.r;
        }
        TLRPC.ChatFull L0 = mu1Var.getMessagesController().L0(chat.id);
        if (L0 == null) {
            i5 = ((d) mu1Var).classGuid;
            gl5 m = gl5.m(y6c.t0, 0, chat);
            gl5 m2 = gl5.m(y6c.t0, 1, chat);
            if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            } else {
                bitmapDrawable = null;
            }
            z = true;
            i6 = i;
            i7 = i2;
            str2 = null;
            z2 = i3;
            wb0Var = new wb0(m, m2, null, str, null, null, bitmapDrawable, chat, cc0VarArr, new yb0(i5, kk7.S, chat));
        } else {
            wb0Var = wb0.a(chat, L0, cc0VarArr);
            i6 = i;
            i7 = i2;
            z = true;
            str2 = null;
            z2 = i3;
        }
        if (xf4.i(wb0Var)) {
            xf4.t().J((ViewGroup) mu1Var.fragmentView, mu1Var.Ba, wb0Var, new ie(this, chat, gb2Var, (byte) 16));
            return z;
        }
        cs5 I = cs5.I(mu1Var, gb2Var);
        I.b(2131232271, k96.M0(2131747593, str2), new it1(this, chat, (byte) 0), false);
        if (chat.broadcast) {
            i8 = 2131232093;
            i9 = 2131747618;
        } else {
            i8 = 2131232118;
            i9 = 2131747606;
        }
        I.k(i8, k96.M0(i9, str2), new jn1(this, gb2Var, chat, (byte) 5), z2);
        I.k(2131232227, k96.M0(2131748417, str2), new it1(this, chat, z ? (byte) 1 : (byte) 0), i6);
        I.k(2131232359, k96.M0(2131753755, str2), new it1(this, chat, (byte) 2), i7);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gl.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final String x(long j) {
        TLRPC.Peer peer;
        String A0;
        mu1 mu1Var = this.a;
        if (!l7c.v(mu1Var.f)) {
            TLRPC.Chat chat = mu1Var.e;
            if (chat != null && !hc2.V(chat) && (A0 = mu1Var.getMessagesController().A0(mu1Var.e.id, j)) != null) {
                return A0;
            }
            TLRPC.TL_forumTopic tL_forumTopic = mu1Var.r4;
            if (tL_forumTopic != null && (peer = tL_forumTopic.from_id) != null && (peer.user_id == j || peer.channel_id == j || peer.chat_id == j)) {
                return k96.M0(2131743783, null);
            }
        }
        return null;
    }

    @Override
    public final void x1(gb2 gb2Var) {
        jd8 jd8Var = this.a.kd;
        if (jd8Var != null && jd8Var.n == gb2Var) {
            jd8Var.x.getClass();
        }
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
        f(gb2Var, z, true, z2);
    }

    @Override
    public final boolean y1() {
        mu1 mu1Var = this.a;
        if (mu1Var.m1.getMeasuredWidth() > mu1Var.m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y2(int i) {
        boolean z;
        ui5 ui5Var;
        ui5 ui5Var2;
        if (i != 16 && i != 2131296267 && i != 2131296264) {
            return false;
        }
        mu1 mu1Var = this.a;
        z = ((d) mu1Var).inPreviewMode;
        if (z && mu1Var.ga) {
            ui5Var = ((d) mu1Var).parentLayout;
            if (ui5Var != null) {
                ui5Var2 = ((d) mu1Var).parentLayout;
                ((ActionBarLayout) ui5Var2).p();
            }
            return true;
        }
        return !b();
    }

    @Override
    public final void z(gb2 gb2Var, float f, float f2) {
        mu1 mu1Var = this.a;
        mu1Var.Q5(gb2Var, false, false, f, f2, true, false, false);
        mu1Var.A0.getClass();
        mu1Var.rc(RecyclerView.R(gb2Var));
    }

    @Override
    public final void z0(defpackage.gb2 r27, float r28, float r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt1.z0(gb2, float, float, boolean):void");
    }

    @Override
    public final boolean z1(k27 k27Var) {
        vs1 vs1Var;
        int i = (k27.B0(k27Var.k) > 1271266957L ? 1 : (k27.B0(k27Var.k) == 1271266957L ? 0 : -1));
        mu1 mu1Var = this.a;
        if ((i == 0 || ((vs1Var = mu1Var.D0) != null && vs1Var.O)) && mu1Var.g4 != 7) {
            return true;
        }
        return false;
    }
}
