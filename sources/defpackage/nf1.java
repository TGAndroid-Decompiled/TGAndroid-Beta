package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class nf1 extends d implements gk7 {
    public static int Q0 = 10;
    public static final int[] R0 = {kk7.S, kk7.r, kk7.s, kk7.C, kk7.F0};
    public HashMap A0;
    public boolean B0;
    public final bf1 C0;
    public ef1 D0;
    public cu6 E;
    public final ArrayList E0;
    public kf1 F;
    public final vf6 F0;
    public TextView G;
    public ze1 G0;
    public su1 H;
    public int H0;
    public FrameLayout I;
    public te1 I0;
    public o72 J;
    public gb2 J0;
    public LinearLayout K;
    public int K0;
    public ImageView L;
    public final mf1 L0;
    public wb M;
    public long M0;
    public uk1 N;
    public int N0;
    public r7 O;
    public int O0;
    public long P;
    public final RectF P0;
    public boolean Q;
    public boolean R;
    public AnimatorSet S;
    public boolean T;
    public final int[] U;
    public boolean V;
    public boolean W;
    public ry1 X;
    public lf1 Y;
    public k27 Z;
    public final mx4 a;
    public TLRPC.ChannelParticipant a0;
    public final kl0 b;
    public FrameLayout b0;
    public final kl0 c;
    public ImageView c0;
    public final cq3 d;
    public jia d0;
    public final int e;
    public yc e0;
    public final TLRPC.Chat f;
    public ix f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final vf6 l0;
    public final vf6 m0;
    public FrameLayout n;
    public final HashMap n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final HashSet q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public boolean t0;
    public ArrayList u0;
    public TLRPC.TL_channelAdminLogEventsFilter v0;
    public fu w;
    public String w0;
    public UndoView x;
    public vf6 x0;
    public zr y;
    public final on y0;
    public final HashMap z0;

    public nf1(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new vf6();
        this.m0 = new vf6();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new on(R0);
        this.z0 = new HashMap();
        this.C0 = new bf1(this);
        this.E0 = new ArrayList();
        this.F0 = new vf6();
        this.H0 = Integer.MAX_VALUE;
        this.L0 = new mf1(this);
        this.N0 = -1;
        this.P0 = new RectF();
        qw4 qw4Var = this.glassEngine;
        qw4Var.a = new ue1(this);
        qw4Var.d = new ax4(gl.L(48.0f));
        ?? obj = new Object();
        this.a = obj;
        kl0 kl0Var = new kl0(obj, obj, obj);
        this.b = kl0Var;
        kl0Var.j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && gba.f()) {
            cq3 cq3Var = new cq3(false);
            this.d = cq3Var;
            this.glassEngine.a(cq3Var);
            lx4 lx4Var = new lx4(obj);
            lx4Var.d = cq3Var;
            lx4Var.e = -3;
            lx4Var.f = obj;
            if (e66.e(262144)) {
                lx4 lx4Var2 = new lx4(obj);
                lx4Var2.d = cq3Var;
                lx4Var2.e = -2;
                lx4Var2.f = obj;
                kl0 kl0Var2 = new kl0(lx4Var2, lx4Var2, lx4Var2);
                this.c = kl0Var2;
                kl0Var2.j = this.glassEngine;
                if (e66.e(262144)) {
                    L2 = gl.L(8.0f);
                } else {
                    L2 = gl.L(48.0f);
                }
                kl0Var2.d = L2;
                kl0Var2.e = L2;
                kl0Var2.k = true;
                this.e = 0;
            } else {
                kl0 kl0Var3 = new kl0(lx4Var, lx4Var, lx4Var);
                this.c = kl0Var3;
                kl0Var3.j = this.glassEngine;
                if (e66.e(262144)) {
                    L = gl.L(8.0f);
                } else {
                    L = gl.L(48.0f);
                }
                kl0Var3.d = L;
                kl0Var3.e = L;
                this.e = gl.L(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            kl0 kl0Var4 = new kl0(obj, obj, obj);
            this.c = kl0Var4;
            kl0Var4.j = this.glassEngine;
        }
        this.f = chat;
    }

    public static a B0(nf1 nf1Var) {
        return nf1Var.actionBar;
    }

    public static a C0(nf1 nf1Var) {
        return nf1Var.actionBar;
    }

    public static a D0(nf1 nf1Var) {
        return nf1Var.actionBar;
    }

    public static int E0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int F0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static uo8 O0(CharSequence charSequence) {
        cm2[] cm2VarArr;
        if (charSequence instanceof Spannable) {
            for (cm2 cm2Var : (cm2[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), cm2.class)) {
                if (cm2Var != null) {
                    Drawable drawable = cm2Var.c;
                    if (drawable instanceof uo8) {
                        return (uo8) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void c1(int i, k27 k27Var) {
        if (k27Var == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = k27Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = k27Var.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            k27Var.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = k96.G(i, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        k27Var.h5();
    }

    public static CharSequence e1(SpannableStringBuilder spannableStringBuilder) {
        int t = gl.t(spannableStringBuilder, "\n\n");
        if (t >= 0 && Build.VERSION.SDK_INT >= 29) {
            mk1.j();
            spannableStringBuilder.setSpan(mk1.g(gl.L(8.0f)), t + 1, t + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int j0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int k0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int l0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int m0(nf1 nf1Var) {
        return nf1Var.classGuid;
    }

    public static int n0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int o0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int p0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int q0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int r0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int s0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int t0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int u0(nf1 nf1Var) {
        return nf1Var.currentAccount;
    }

    public static int v0(nf1 nf1Var) {
        return nf1Var.classGuid;
    }

    public final k27 H0(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        k27 k27Var;
        k27 k27Var2;
        String str;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            k27Var = null;
            if (i < arrayList2.size()) {
                k27Var2 = (k27) arrayList2.get(i);
                if (k27Var2 != null && k27Var2.U == 1 && k27Var2.J0 == j) {
                    break;
                }
                i++;
            } else {
                k27Var2 = null;
                break;
            }
        }
        if (k27Var2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((k27) arrayList.get(0)).k.date;
            } catch (Exception e) {
                fa4.g(e, true);
            }
            k27Var2 = new k27(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j2));
        k27Var2.U = 1;
        if (z2 && arrayList.size() > 1) {
            k27Var2.J0 = j;
        } else {
            k27Var2.J0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new xz((byte) 2)).distinct().map(new ve1(this, (byte) 0)).filter(new sd((byte) 2)).limit(4L).toArray());
        if (z2) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k27.D5(k96.G(arrayList.size(), str, join), "un1", V1));
        if (z2 && arrayList.size() > 1) {
            uo8 O0 = O0(k27Var2.v);
            int i2 = 2131751023;
            if (O0 == null) {
                if (z) {
                    i2 = 2131751024;
                }
                O0 = new uo8(k96.M0(i2, null));
                Typeface o = gl.o();
                gn gnVar = O0.a;
                gnVar.x(o);
                gnVar.w(gl.L(10.0f));
                if (O0.c != -1) {
                    O0.c = -1;
                    O0.invalidateSelf();
                }
                O0.a(503316480);
            } else {
                gn gnVar2 = O0.a;
                if (z) {
                    i2 = 2131751024;
                }
                gnVar2.t(k96.M0(i2, null), false, true);
            }
            O0.setBounds(0, 0, O0.getIntrinsicWidth(), gl.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new cm2(0, O0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        k27Var2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            k27Var = (k27) b00.f(1, arrayList);
        }
        if (k27Var != null) {
            long j3 = k27Var.T;
            vf6 vf6Var = this.F0;
            if (!vf6Var.d(j3)) {
                long j4 = k27Var.T;
                int i3 = Q0;
                Q0 = i3 + 1;
                vf6Var.k(Integer.valueOf(i3), j4);
            }
            k27Var2.m1 = ((Integer) vf6Var.f(k27Var.T)).intValue();
        }
        return k27Var2;
    }

    public final void I0(android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf1.I0(android.os.Bundle, long):void");
    }

    public final void J0(k27 k27Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        if (k27Var.D == 3) {
            hdVar.U = k96.M0(2131747986, null);
        } else {
            hdVar.U = k96.a0(null, null, 2131748013, k27Var.F0().mime_type);
        }
        showDialog(hdVar);
    }

    public final void K0(boolean z) {
        int abs;
        zr zrVar = this.y;
        if (zrVar != null && !this.j0) {
            int K0 = zrVar.K0();
            int i = 1;
            if (K0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(this.y.M0() - K0) + 1;
            }
            if (abs > 0) {
                this.F.getClass();
                if (z) {
                    i = 4;
                }
                if (K0 <= i && !this.s0 && !this.r0) {
                    W0(false);
                }
            }
        }
    }

    public final boolean L0(android.view.View r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf1.L0(android.view.View, float, float):boolean");
    }

    public final TextureView M0(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            yc ycVar = new yc((byte) 7, getParentActivity(), this);
            this.e0 = ycVar;
            ycVar.setOutlineProvider(new xi((byte) 2));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            ix ixVar = new ix(getParentActivity());
            this.f0 = ixVar;
            ixVar.setBackgroundColor(0);
            if (z) {
                this.e0.addView(this.f0, nme.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, nme.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            lf1 lf1Var = this.Y;
            yc ycVar2 = this.e0;
            int i = gl.u;
            lf1Var.addView(ycVar2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void N0() {
        long j;
        k27 k27Var;
        long j2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList4 = this.o0;
            if (i3 < arrayList4.size()) {
                k27 k27Var2 = (k27) arrayList4.get(i3);
                if (k27Var2 != null && (tL_channelAdminLogEvent2 = k27Var2.L1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j = tL_channelAdminLogEvent2.user_id;
                } else {
                    j = 0;
                }
                if (k27Var2.m1 <= 0) {
                    int i4 = Q0;
                    Q0 = i4 + 1;
                    k27Var2.m1 = i4;
                }
                int i5 = i3 + 1;
                if (i5 < arrayList4.size()) {
                    k27Var = (k27) arrayList4.get(i5);
                } else {
                    k27Var = null;
                }
                if (k27Var != null && (tL_channelAdminLogEvent = k27Var.L1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j2 = tL_channelAdminLogEvent.user_id;
                } else {
                    j2 = 0;
                }
                if (j != 0) {
                    arrayList3.add(k27Var2);
                } else {
                    arrayList2.add(k27Var2);
                }
                if (j != j2 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = k27Var2.k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((k27) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((k27) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        k27 k27Var3 = (k27) b00.f(1, arrayList3);
                        if (TextUtils.isEmpty(this.w0) && arrayList3.size() > 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Long valueOf = Long.valueOf(k27Var3.T);
                        HashSet hashSet = this.q0;
                        if (!hashSet.contains(valueOf) && z2) {
                            c1(arrayList3.size() - 1, k27Var3);
                            arrayList2.add(k27Var3);
                        } else {
                            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                c1(0, (k27) arrayList3.get(i6));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = k27Var3.k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z != z3) {
                            k27Var3.M1 = true;
                            kf1 kf1Var = this.F;
                            if (z) {
                                i = arrayList3.size() - 1;
                            } else {
                                i = 0;
                            }
                            kf1Var.g(i + size);
                            kf1 kf1Var2 = this.F;
                            if (z) {
                                i2 = arrayList3.size() - 1;
                            } else {
                                i2 = 0;
                            }
                            kf1Var2.g(size + i2 + 1);
                        }
                        long j3 = k27Var2.T;
                        arrayList = arrayList3;
                        arrayList2.add(H0(j3, k27Var2.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j3)), z2));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        k27 k27Var4 = (k27) b00.f(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(H0(k27Var4.T, k27Var4.L1.user_id, arrayList5, true, false));
                    }
                    arrayList.clear();
                } else {
                    arrayList = arrayList3;
                }
                i3 = i5;
                arrayList3 = arrayList;
            } else {
                ArrayList arrayList6 = this.p0;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                return;
            }
        }
    }

    public final void P0(boolean z) {
        if (this.N.getTag() != null && !this.Q) {
            if (!this.T || this.R) {
                this.N.setTag(null);
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.S = animatorSet;
                    animatorSet.setDuration(150L);
                    this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
                    this.S.addListener(new bb1(this, (byte) 2));
                    this.S.setStartDelay(500L);
                    this.S.start();
                    return;
                }
                AnimatorSet animatorSet2 = this.S;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
            }
        }
    }

    public final void Q0(int i) {
        cq3 cq3Var;
        if (Build.VERSION.SDK_INT >= 31 && (cq3Var = this.d) != null) {
            if (fod.a(i, 4)) {
                zw4 e = this.glassEngine.e();
                e.b(this.w.getY(), this.Y.getWidth(), this.w.getY() + this.w.getHeight());
                cq3Var.h(e);
            }
            lf1 lf1Var = this.Y;
            Objects.requireNonNull(lf1Var);
            cq3Var.e(new vw0(lf1Var, (byte) 1), this.Y.getWidth(), this.Y.getHeight());
        }
    }

    public final void R0(int r21, java.util.ArrayList r22, java.lang.Integer r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf1.R0(int, java.util.ArrayList, java.lang.Integer):void");
    }

    public final void S0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        int i;
        boolean z;
        boolean z2;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && getParentActivity() != null) {
            int i2 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 0, getResourceProvider(), getParentActivity());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(gl.L(200.0f));
            Rect rect = new Rect();
            getParentActivity().getResources().getDrawable(2131232569).mutate().getPadding(rect);
            zkb.h(bkb.F8, getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                if (arrayList4.get(i3) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new j8(getParentActivity(), getResourceProvider()), nme.o(-1, 8));
                } else {
                    Activity parentActivity = getParentActivity();
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i3 == size - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a8 a8Var = new a8(0, getResourceProvider(), parentActivity, z, z2);
                    a8Var.setMinimumWidth(gl.L(200.0f));
                    a8Var.j((CharSequence) arrayList2.get(i3), ((Integer) arrayList3.get(i3)).intValue(), null);
                    if (((Integer) arrayList4.get(i3)).intValue() == 35) {
                        a8Var.d(getThemedColor(bkb.p7), getThemedColor(bkb.o7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                    a8Var.setOnClickListener(new pg(this, i3, arrayList4, (Integer) arrayList4.get(i3), (byte) 1));
                }
                i3++;
                arrayList4 = arrayList;
            }
            ye1 ye1Var = new ye1(this, this.Y.getContext(), (byte) 0);
            ye1Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            ye1Var.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            ze1 ze1Var = new ze1(this, ye1Var);
            this.G0 = ze1Var;
            ze1Var.e = true;
            ze1Var.c = (short) 220;
            ze1Var.setOutsideTouchable(true);
            this.G0.setClippingEnabled(true);
            this.G0.setAnimationStyle(2131755192);
            this.G0.setFocusable(true);
            ye1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
            this.G0.setInputMethodMode(2);
            this.G0.setSoftInputMode(48);
            this.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f)) - ye1Var.getMeasuredWidth()) + rect.left) - gl.L(28.0f);
            if (left < gl.L(6.0f)) {
                left = gl.L(6.0f);
            } else if (left > (this.w.getMeasuredWidth() - gl.L(6.0f)) - ye1Var.getMeasuredWidth()) {
                left = (this.w.getMeasuredWidth() - gl.L(6.0f)) - ye1Var.getMeasuredWidth();
            }
            if (gl.O1()) {
                int[] iArr = new int[2];
                this.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = this.Y.getHeight();
            int L = gl.L(48.0f) + ye1Var.getMeasuredHeight();
            int Q = this.Y.Q();
            if (Q > gl.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                i = (int) (this.w.getY() + view.getTop() + f2);
                if ((L - rect.top) - rect.bottom > gl.L(240.0f)) {
                    i += gl.L(240.0f) - L;
                }
                if (i < this.w.getY() + gl.L(24.0f)) {
                    i = (int) (this.w.getY() + gl.L(24.0f));
                } else {
                    int i4 = height - L;
                    if (i > i4 - gl.L(8.0f)) {
                        i = i4 - gl.L(8.0f);
                    }
                }
            } else {
                if (!this.inBubbleMode) {
                    i2 = gl.m;
                }
                i = i2;
            }
            ye1Var.setMaxHeight(height - i);
            this.G0.showAtLocation(this.w, 51, left, i);
            this.G0.b();
        }
    }

    public final void T0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull L0;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().b4(tL_channels_channelParticipants.users, false);
            getMessagesController().V3(tL_channels_channelParticipants.chats, false);
            this.u0 = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.f;
            if (chat != null && (L0 = getMessagesController().L0(chat.id)) != null && L0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = getMessagesController().L3;
                channelParticipant.peer = getMessagesController().w1(channelParticipant.user_id);
                long j = getMessagesController().L3;
                if (getMessagesController().V1(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new se1(this, (byte) 1));
                }
                this.u0.add(0, channelParticipant);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof ib) {
                ((ib) dialog).Z0(this.u0);
            }
        }
    }

    public final void U0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        k27 k27Var;
        int i = 0;
        this.D0.N = false;
        Z0(false);
        na7.q1(this.currentAccount).b4(tL_channels_adminLogResults.users, false);
        na7.q1(this.currentAccount).V3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = this.o0;
        boolean z = false;
        for (int i2 = 0; i2 < tL_channels_adminLogResults.events.size(); i2++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            long j = tL_channelAdminLogEvent.id;
            vf6 vf6Var = this.l0;
            if (vf6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent.id);
                k27 k27Var2 = new k27(this.currentAccount, tL_channelAdminLogEvent, arrayList, this.n0, this.f, this.U, false);
                if (k27Var2.U >= 0) {
                    vf6Var.k(k27Var2, tL_channelAdminLogEvent.id);
                }
                z = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            k27 k27Var3 = (k27) arrayList.get(size);
            if (k27Var3 != null && k27Var3.U != 0 && k27Var3.L1() >= 0) {
                this.m0.k(k27Var3, k27Var3.L1());
            }
            if (k27Var3 != null && (message = k27Var3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (size != i3) {
                                k27Var = (k27) arrayList.get(i3);
                                if (k27Var.U != 1 && k27Var.L1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            k27Var = null;
                            break;
                        }
                    }
                    if (k27Var != null) {
                        k27Var3.C = k27Var;
                    }
                }
                arrayList2.add(k27Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            hq6.d0(this.currentAccount).Y0(arrayList2, -this.f.id, 0, 0L, new te1(this, (byte) 1), getClassGuid(), null);
        }
        N0();
        this.s0 = false;
        if (!z) {
            this.r0 = true;
        }
        gl.T3(this.n, false, 0.3f, true, true);
        this.w.setEmptyView(this.I);
        kf1 kf1Var = this.F;
        if (kf1Var != null) {
            kf1Var.f();
        }
        r7 r7Var = this.O;
        if (r7Var != null) {
            if (this.p0.isEmpty() && TextUtils.isEmpty(this.w0)) {
                i = 8;
            }
            r7Var.setVisibility(i);
        }
    }

    public final void V0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.t0 = false;
        this.D0.N = false;
        Z0(false);
        na7.q1(this.currentAccount).b4(tL_channels_adminLogResults.users, false);
        na7.q1(this.currentAccount).V3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            vf6 vf6Var = this.l0;
            if (vf6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent2.id);
                k27 k27Var = new k27(this.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, this.f, this.U, false);
                if (k27Var.U >= 0 && (((tL_channelAdminLogEvent = k27Var.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !vf6Var.d(tL_channelAdminLogEvent2.id))) {
                    this.o0.add(0, k27Var);
                    vf6Var.k(k27Var, tL_channelAdminLogEvent2.id);
                    z = true;
                }
            }
        }
        if (this.F != null && z) {
            N0();
            this.F.f();
        }
    }

    public final void W0(boolean z) {
        kf1 kf1Var;
        if (!this.s0) {
            ArrayList arrayList = this.o0;
            if (z) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.n;
                if (frameLayout != null) {
                    gl.T3(frameLayout, true, 0.3f, true, true);
                    this.I.setVisibility(4);
                    this.w.setEmptyView(null);
                }
                this.l0.b();
                arrayList.clear();
                this.n0.clear();
                N0();
            }
            this.s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = na7.g1(this.f);
            tL_channels_getAdminLog.q = this.w0;
            tL_channels_getAdminLog.limit = 50;
            if (!z && !arrayList.isEmpty()) {
                tL_channels_getAdminLog.max_id = this.P;
            } else {
                tL_channels_getAdminLog.max_id = 0L;
            }
            tL_channels_getAdminLog.min_id = 0L;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
            if (tL_channelAdminLogEventsFilter != null) {
                tL_channels_getAdminLog.flags |= 1;
                tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
            }
            if (this.x0 != null) {
                tL_channels_getAdminLog.flags |= 2;
                for (int i = 0; i < this.x0.m(); i++) {
                    tL_channels_getAdminLog.admins.add(na7.q1(this.currentAccount).o1((TLRPC.User) this.x0.n(i)));
                }
            }
            f1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new se1(this, (byte) 3));
            if (z && (kf1Var = this.F) != null) {
                kf1Var.f();
            }
        }
    }

    public final void X0() {
        if (this.w != null && !this.o0.isEmpty()) {
            this.y.g1(this.p0.size() - 1, (-100000) - this.w.getPaddingTop());
        }
    }

    public final void Y0() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = na7.g1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags |= 1;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.x0.m(); i++) {
                tL_channels_getAdminLog.admins.add(na7.q1(this.currentAccount).o1((TLRPC.User) this.x0.n(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new se1(this, (byte) 0));
    }

    public final void Z0(boolean z) {
        int i;
        long j;
        fu fuVar = this.w;
        if (fuVar != null && this.y != null && fuVar.getChildCount() > 0) {
            if (z) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
            gb2 gb2Var = null;
            int i2 = -1;
            for (int i3 = 0; i3 < this.w.getChildCount(); i3++) {
                View childAt = this.w.getChildAt(i3);
                this.w.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    int top = childAt.getTop();
                    if (z) {
                        if (top >= i) {
                        }
                        i = childAt.getTop();
                        gb2Var = childAt;
                        i2 = R;
                    } else {
                        if (top <= i) {
                        }
                        i = childAt.getTop();
                        gb2Var = childAt;
                        i2 = R;
                    }
                }
            }
            if (gb2Var != null) {
                if (gb2Var instanceof gb2) {
                    j = gb2Var.getMessageObject().T;
                } else if (gb2Var instanceof uk1) {
                    j = gb2Var.getMessageObject().T;
                } else {
                    j = 0;
                }
                this.M0 = j;
                this.N0 = i2;
                this.O0 = (this.w.getMeasuredHeight() - gb2Var.getBottom()) - this.w.getPaddingBottom();
            }
        }
    }

    public final int a1(k27 k27Var) {
        gb2 gb2Var = this.J0;
        if (gb2Var != null) {
            gb2Var.td = 0;
            gb2Var.ud = null;
        }
        return 0;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.vf));
        hashSet.add(Integer.valueOf(bkb.uf));
        hashSet.add(Integer.valueOf(bkb.Fc));
        hashSet.add(Integer.valueOf(bkb.gf));
        hashSet.add(Integer.valueOf(bkb.Hc));
        hashSet.add(Integer.valueOf(bkb.Gc));
        hashSet.add(Integer.valueOf(bkb.jf));
        hashSet.add(Integer.valueOf(bkb.hf));
        hashSet.add(Integer.valueOf(bkb.ld));
        hashSet.add(Integer.valueOf(bkb.Ze));
        hashSet.add(Integer.valueOf(bkb.kd));
        hashSet.add(Integer.valueOf(bkb.Ye));
        hashSet.add(Integer.valueOf(bkb.Gb));
        hashSet.add(Integer.valueOf(bkb.Ec));
        hashSet.add(Integer.valueOf(bkb.Fb));
        hashSet.add(Integer.valueOf(bkb.Dc));
        hashSet.add(Integer.valueOf(bkb.Qb));
        hashSet.add(Integer.valueOf(bkb.Kd));
        hashSet.add(Integer.valueOf(bkb.Ae));
        hashSet.add(Integer.valueOf(bkb.Bc));
        hashSet.add(Integer.valueOf(bkb.ze));
        hashSet.add(Integer.valueOf(bkb.Ac));
        hashSet.add(Integer.valueOf(bkb.ye));
        hashSet.add(Integer.valueOf(bkb.zc));
        hashSet.add(Integer.valueOf(bkb.xe));
        hashSet.add(Integer.valueOf(bkb.yc));
        hashSet.add(Integer.valueOf(bkb.we));
        hashSet.add(Integer.valueOf(bkb.xc));
        hashSet.add(Integer.valueOf(bkb.ve));
        hashSet.add(Integer.valueOf(bkb.wc));
        hashSet.add(Integer.valueOf(bkb.ue));
        hashSet.add(Integer.valueOf(bkb.vc));
        hashSet.add(Integer.valueOf(bkb.te));
        hashSet.add(Integer.valueOf(bkb.uc));
        hashSet.add(Integer.valueOf(bkb.se));
        hashSet.add(Integer.valueOf(bkb.tc));
        hashSet.add(Integer.valueOf(bkb.re));
        hashSet.add(Integer.valueOf(bkb.sc));
        hashSet.add(Integer.valueOf(bkb.qe));
        hashSet.add(Integer.valueOf(bkb.rc));
        hashSet.add(Integer.valueOf(bkb.pe));
        hashSet.add(Integer.valueOf(bkb.qc));
        hashSet.add(Integer.valueOf(bkb.oe));
        hashSet.add(Integer.valueOf(bkb.pc));
        hashSet.add(Integer.valueOf(bkb.le));
        hashSet.add(Integer.valueOf(bkb.ne));
        hashSet.add(Integer.valueOf(bkb.me));
        hashSet.add(Integer.valueOf(bkb.ke));
        hashSet.add(Integer.valueOf(bkb.lc));
        hashSet.add(Integer.valueOf(bkb.je));
        hashSet.add(Integer.valueOf(bkb.kc));
        hashSet.add(Integer.valueOf(bkb.ie));
        hashSet.add(Integer.valueOf(bkb.jc));
        hashSet.add(Integer.valueOf(bkb.he));
        hashSet.add(Integer.valueOf(bkb.bc));
        hashSet.add(Integer.valueOf(bkb.fe));
        hashSet.add(Integer.valueOf(bkb.dc));
        hashSet.add(Integer.valueOf(bkb.ee));
        hashSet.add(Integer.valueOf(bkb.ic));
        hashSet.add(Integer.valueOf(bkb.de));
        hashSet.add(Integer.valueOf(bkb.ae));
        hashSet.add(Integer.valueOf(bkb.hc));
        hashSet.add(Integer.valueOf(bkb.Zd));
        hashSet.add(Integer.valueOf(bkb.gc));
        hashSet.add(Integer.valueOf(bkb.Yd));
        hashSet.add(Integer.valueOf(bkb.Xd));
        hashSet.add(Integer.valueOf(bkb.Xb));
        hashSet.add(Integer.valueOf(bkb.Td));
        hashSet.add(Integer.valueOf(bkb.Wb));
        hashSet.add(Integer.valueOf(bkb.Sd));
        hashSet.add(Integer.valueOf(bkb.Rd));
        hashSet.add(Integer.valueOf(bkb.Vb));
        hashSet.add(Integer.valueOf(bkb.Qd));
        hashSet.add(Integer.valueOf(bkb.Ub));
        hashSet.add(Integer.valueOf(bkb.Pd));
        hashSet.add(Integer.valueOf(bkb.Tb));
        hashSet.add(Integer.valueOf(bkb.Od));
        hashSet.add(Integer.valueOf(bkb.Nd));
        hashSet.add(Integer.valueOf(bkb.Ld));
        hashSet.add(Integer.valueOf(bkb.Hd));
        hashSet.add(Integer.valueOf(bkb.Pb));
        hashSet.add(Integer.valueOf(bkb.Gd));
        hashSet.add(Integer.valueOf(bkb.Ob));
        hashSet.add(Integer.valueOf(bkb.Ed));
        hashSet.add(Integer.valueOf(bkb.Dd));
        hashSet.add(Integer.valueOf(bkb.Cd));
        hashSet.add(Integer.valueOf(bkb.Bd));
        hashSet.add(Integer.valueOf(bkb.Nb));
        hashSet.add(Integer.valueOf(bkb.Ad));
        hashSet.add(Integer.valueOf(bkb.zd));
        hashSet.add(Integer.valueOf(bkb.yd));
        hashSet.add(Integer.valueOf(bkb.wd));
        hashSet.add(Integer.valueOf(bkb.vd));
        hashSet.add(Integer.valueOf(bkb.pa));
        hashSet.add(Integer.valueOf(bkb.q7));
        hashSet.add(Integer.valueOf(bkb.yb));
        hashSet.add(Integer.valueOf(bkb.ud));
        hashSet.add(Integer.valueOf(bkb.td));
        hashSet.add(Integer.valueOf(bkb.Mb));
        hashSet.add(Integer.valueOf(bkb.Lb));
        hashSet.add(Integer.valueOf(bkb.sd));
        hashSet.add(Integer.valueOf(bkb.rd));
        hashSet.add(Integer.valueOf(bkb.qd));
        hashSet.add(Integer.valueOf(bkb.Kb));
        hashSet.add(Integer.valueOf(bkb.Jb));
        hashSet.add(Integer.valueOf(bkb.pd));
        hashSet.add(Integer.valueOf(bkb.od));
        hashSet.add(Integer.valueOf(bkb.nd));
        hashSet.add(Integer.valueOf(bkb.Ib));
        hashSet.add(Integer.valueOf(bkb.Hb));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Xc));
        hashSet.add(Integer.valueOf(bkb.Wc));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.Uc));
        hashSet.add(Integer.valueOf(bkb.cd));
        hashSet.add(Integer.valueOf(bkb.bd));
        hashSet.add(Integer.valueOf(bkb.ad));
        hashSet.add(Integer.valueOf(bkb.Zc));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.vb));
        hashSet.add(Integer.valueOf(bkb.ub));
        hashSet.add(Integer.valueOf(bkb.tb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.n8));
        hashSet.add(Integer.valueOf(bkb.m8));
        hashSet.add(Integer.valueOf(bkb.l8));
        hashSet.add(Integer.valueOf(bkb.k8));
        hashSet.add(Integer.valueOf(bkb.j8));
        hashSet.add(Integer.valueOf(bkb.i8));
        hashSet.add(Integer.valueOf(bkb.h8));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.A8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b1(defpackage.k27 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf1.b1(k27):void");
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new gb2(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        bkb.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!gl.O1());
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 19));
        o72 o72Var = new o72(context, null, false, null);
        this.J = o72Var;
        zr1 zr1Var = o72Var.h;
        if (zr1Var != null) {
            zr1Var.setTextSizePx(gl.L(17.5f));
        }
        zr1 zr1Var2 = o72Var.r;
        if (zr1Var2 != null) {
            zr1Var2.setTextSizePx(gl.L(13.5f));
        }
        o72Var.m0 = true;
        this.J.setOccupyStatusBar(!gl.O1());
        this.actionBar.addView(this.J, 0, nme.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        r7 a = this.actionBar.t().a(0, 2131232491);
        a.N();
        a.I = new q10(this, (byte) 1);
        this.O = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        o72 o72Var2 = this.J;
        TLRPC.Chat chat = this.f;
        o72Var2.setTitle(chat.title);
        this.J.setSubtitle(k96.M0(2131751062, null));
        this.J.setChatAvatar(chat);
        df1 df1Var = new df1(this, context);
        this.fragmentView = df1Var;
        this.Y = df1Var;
        df1Var.setOccupyStatusBar(!gl.O1());
        this.Y.U(bkb.r0());
        a aVar = this.actionBar;
        pl0 o = nod.o(this.resourceProvider);
        kl0 kl0Var = this.c;
        aVar.P(kl0Var, o, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, nme.e(-1, -2, 17));
        this.I.setOnTouchListener(new p8((byte) 24));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new qjb(this.M, this.Y, gl.L(12.0f), bkb.e2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(2131231615);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, nme.t(54, 54, 17, 16, 20, 16, -4));
        wb wbVar = new wb(context, (byte) 14);
        this.M = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        wb wbVar2 = this.M;
        int i2 = bkb.Yc;
        zkb.X(wbVar2, i2, null);
        this.M.setPadding(gl.L(8.0f), gl.L(5.0f), gl.L(8.0f), gl.L(5.0f));
        this.K.addView(this.M, nme.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, nme.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        fu fuVar = new fu((byte) 5, context, this);
        this.w = fuVar;
        fuVar.setOnItemClickListener(new l69(this, (byte) 16));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        fu fuVar2 = this.w;
        kf1 kf1Var = new kf1(this, context);
        this.F = kf1Var;
        fuVar2.setAdapter(kf1Var);
        this.w.setClipToPadding(false);
        fu fuVar3 = this.w;
        int i3 = gl.m;
        int i4 = this.e;
        fuVar3.setPadding(0, gl.L(4.0f) + a.getCurrentActionBarHeight() + i3 + i4, 0, gl.L(60.0f) + i4 + gl.n);
        fu fuVar4 = this.w;
        ef1 ef1Var = new ef1(this, this.w, this.resourceProvider);
        this.D0 = ef1Var;
        fuVar4.setItemAnimator(ef1Var);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        zr zrVar = new zr(this);
        this.y = zrVar;
        zrVar.i1(1);
        this.y.k1(true);
        this.w.setLayoutManager(this.y);
        cu6 cu6Var = new cu6(this.w, this.y);
        this.E = cu6Var;
        cu6Var.n = new ue1(this);
        cu6Var.r = this.L0;
        this.Y.addView(this.w, nme.c(-1.0f, -1));
        this.w.setOnScrollListener(new y(this));
        this.glassEngine.b(this.w);
        int i5 = this.h0;
        if (i5 != -1) {
            this.y.g1(i5, this.i0);
            this.h0 = -1;
        }
        ry1 ry1Var = new ry1(context);
        this.X = ry1Var;
        ry1Var.setup(this.b);
        this.X.setFadeZoneTop(gl.L(2.0f) + a.getCurrentActionBarHeight() + gl.m);
        this.X.setFadeHeightTop(gl.L(60.0f));
        this.X.setFadeZoneBottom(gl.L(7.0f) + gl.L(44.0f) + gl.L(9.0f) + gl.n);
        this.X.setFadeHeightBottom(gl.L(60.0f));
        this.Y.addView(this.X, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, nme.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new qjb(this.r, this.Y, gl.L(18.0f), bkb.e2));
        this.n.addView(this.r, nme.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gl.L(28.0f));
        this.s.setProgressColor(bkb.w0(null, i2, false));
        this.n.addView(this.s, nme.e(32, 32, 17));
        uk1 uk1Var = new uk1(context);
        this.N = uk1Var;
        uk1Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, nme.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        wjb wjbVar = this.resourceProvider;
        su1 su1Var = new su1(context, wjbVar, nod.b(wjbVar), kl0Var);
        this.H = su1Var;
        su1Var.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-gl.n);
        this.H.c(4, true, false);
        su1 su1Var2 = this.H;
        il0 c = su1Var2.n.c(su1Var2, null, false);
        c.p(su1Var2.r);
        ug8.r(c, gl.L(22.0f), 6.0f);
        su1Var2.s = c;
        this.Y.addView(this.H, nme.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final nf1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nf1 nf1Var = this.b;
                switch (b) {
                    case 0:
                        if (nf1Var.getParentActivity() != null) {
                            ib ibVar = new ib(nf1Var, nf1Var.v0, nf1Var.x0, nf1Var.f.megagroup);
                            ibVar.Z0(nf1Var.u0);
                            ibVar.b2 = new ue1(nf1Var);
                            nf1Var.showDialog(ibVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        boolean z = nf1Var.f.megagroup;
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.U = gl.S2(k96.M0(2131750965, null));
                        } else {
                            hdVar.U = gl.S2(k96.M0(2131750964, null));
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.S = k96.M0(2131750963, null);
                        nf1Var.showDialog(hdVar);
                        return;
                    default:
                        if (nf1Var.getParentActivity() != null) {
                            gl.t1(nf1Var.O.getSearchField());
                            nf1Var.showDialog((fx0) ij.o(nf1Var.getParentActivity(), new re1(nf1Var, (byte) 0), null).a);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(gl.o());
        zkb.X(this.G, bkb.rf, null);
        this.G.setText(k96.M0(2131745791, null));
        this.G.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
        this.H.getContainer().addView(this.G, nme.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) {
            public final nf1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nf1 nf1Var = this.b;
                switch (b) {
                    case 0:
                        if (nf1Var.getParentActivity() != null) {
                            ib ibVar = new ib(nf1Var, nf1Var.v0, nf1Var.x0, nf1Var.f.megagroup);
                            ibVar.Z0(nf1Var.u0);
                            ibVar.b2 = new ue1(nf1Var);
                            nf1Var.showDialog(ibVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        boolean z = nf1Var.f.megagroup;
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.U = gl.S2(k96.M0(2131750965, null));
                        } else {
                            hdVar.U = gl.S2(k96.M0(2131750964, null));
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.S = k96.M0(2131750963, null);
                        nf1Var.showDialog(hdVar);
                        return;
                    default:
                        if (nf1Var.getParentActivity() != null) {
                            gl.t1(nf1Var.O.getSearchField());
                            nf1Var.showDialog((fx0) ij.o(nf1Var.getParentActivity(), new re1(nf1Var, (byte) 0), null).a);
                            return;
                        }
                        return;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.b0.setVisibility(4);
        this.b0.setFocusable(true);
        this.b0.setFocusableInTouchMode(true);
        this.b0.setClickable(true);
        this.b0.setPadding(0, gl.L(3.0f), 0, 0);
        this.Y.addView(this.b0, nme.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(2131232081);
        zkb.s(this.c0, bkb.of, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, nme.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) {
            public final nf1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                nf1 nf1Var = this.b;
                switch (b) {
                    case 0:
                        if (nf1Var.getParentActivity() != null) {
                            ib ibVar = new ib(nf1Var, nf1Var.v0, nf1Var.x0, nf1Var.f.megagroup);
                            ibVar.Z0(nf1Var.u0);
                            ibVar.b2 = new ue1(nf1Var);
                            nf1Var.showDialog(ibVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        boolean z = nf1Var.f.megagroup;
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.U = gl.S2(k96.M0(2131750965, null));
                        } else {
                            hdVar.U = gl.S2(k96.M0(2131750964, null));
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.S = k96.M0(2131750963, null);
                        nf1Var.showDialog(hdVar);
                        return;
                    default:
                        if (nf1Var.getParentActivity() != null) {
                            gl.t1(nf1Var.O.getSearchField());
                            nf1Var.showDialog((fx0) ij.o(nf1Var.getParentActivity(), new re1(nf1Var, (byte) 0), null).a);
                            return;
                        }
                        return;
                }
            }
        });
        jia jiaVar = new jia(context);
        this.d0 = jiaVar;
        zkb.W(jiaVar, bkb.pf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(gl.o());
        this.b0.addView(this.d0, nme.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            gl.T3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            gl.T3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        fu fuVar5 = this.w;
        fuVar5.X1 = true;
        fuVar5.Y1 = true;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(gl.L(51.0f));
        this.Y.addView(this.x, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        f1();
        return this.fragmentView;
    }

    public final void d1(TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        na7 messagesController = getMessagesController();
        TLRPC.Chat chat = this.f;
        TLRPC.ChatFull L0 = messagesController.L0(chat.id);
        zq5 zq5Var = new zq5(this.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, L0, hashMap, this, L0.id, false, hc2.T(chat));
        zq5Var.d2 = new cf1(this);
        zq5Var.show();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gb2 gb2Var;
        k27 messageObject;
        gb2 gb2Var2;
        k27 messageObject2;
        gb2 gb2Var3;
        k27 messageObject3;
        boolean z;
        if (i == kk7.k4) {
            fu fuVar = this.w;
            if (fuVar != null) {
                fuVar.h1();
                return;
            }
            return;
        }
        if (i == kk7.g2) {
            if (((k27) objArr[0]).g4()) {
                MediaController.w().o0(M0(true), this.f0, this.e0, true);
                int childCount = this.w.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        View childAt = this.w.getChildAt(i3);
                        if (childAt instanceof gb2) {
                            gb2 gb2Var4 = (gb2) childAt;
                            k27 messageObject4 = gb2Var4.getMessageObject();
                            if (this.e0 != null && messageObject4.g4() && MediaController.w().D(messageObject4)) {
                                ImageReceiver photoImage = gb2Var4.getPhotoImage();
                                this.e0.setTranslationX(photoImage.L0);
                                this.e0.setTranslationY(gb2Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                                this.fragmentView.invalidate();
                                this.e0.invalidate();
                                z = true;
                                break;
                            }
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (this.e0 != null) {
                    k27 k27Var = MediaController.w().v0;
                    if (!z) {
                        this.e0.setTranslationY((-gl.u) - 100);
                        this.fragmentView.invalidate();
                        if (k27Var != null && k27Var.g4() && (this.W || PipRoundVideoView.G != null)) {
                            MediaController.w().j0(false);
                        }
                    } else {
                        MediaController.w().j0(true);
                    }
                }
            }
            fu fuVar2 = this.w;
            if (fuVar2 != null) {
                int childCount2 = fuVar2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.w.getChildAt(i4);
                    if ((childAt2 instanceof gb2) && (messageObject3 = (gb2Var3 = (gb2) childAt2).getMessageObject()) != null) {
                        if (!k27.Q4(messageObject3.k) && !messageObject3.I3()) {
                            if (messageObject3.g4()) {
                                gb2Var3.p0(null, false);
                                if (!MediaController.w().D(messageObject3) && messageObject3.b0 != 0.0f) {
                                    messageObject3.F5();
                                    gb2Var3.invalidate();
                                }
                            }
                        } else {
                            gb2Var3.R3(false, true, false);
                        }
                    }
                }
            }
        } else if (i != kk7.e2 && i != kk7.f2) {
            if (i == kk7.d2) {
                Integer num = (Integer) objArr[0];
                fu fuVar3 = this.w;
                if (fuVar3 != null) {
                    int childCount3 = fuVar3.getChildCount();
                    for (int i5 = 0; i5 < childCount3; i5++) {
                        View childAt3 = this.w.getChildAt(i5);
                        if ((childAt3 instanceof gb2) && (messageObject2 = (gb2Var2 = (gb2) childAt3).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                            k27 k27Var2 = MediaController.w().v0;
                            if (k27Var2 != null) {
                                messageObject2.b0 = k27Var2.b0;
                                messageObject2.i0 = k27Var2.i0;
                                messageObject2.j0 = k27Var2.j0;
                                gb2Var2.W3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i == kk7.B4 && this.fragmentView != null) {
                this.Y.U(bkb.r0());
                this.r.invalidate();
                wb wbVar = this.M;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                this.w.h1();
            }
        } else {
            fu fuVar4 = this.w;
            if (fuVar4 != null) {
                int childCount4 = fuVar4.getChildCount();
                for (int i6 = 0; i6 < childCount4; i6++) {
                    View childAt4 = this.w.getChildAt(i6);
                    if ((childAt4 instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt4).getMessageObject()) != null) {
                        if (!k27.Q4(messageObject.k) && !messageObject.I3()) {
                            if (messageObject.g4() && !MediaController.w().D(messageObject)) {
                                gb2Var.p0(null, true);
                            }
                        } else {
                            gb2Var.R3(false, true, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(gl.L(8.0f), gl.L(3.0f), gl.L(8.0f), gl.L(3.0f));
            this.M.setText(gl.S2(k96.M0(2131748009, null)));
        } else if (this.x0 == null && this.v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
            boolean z = this.f.megagroup;
            wb wbVar = this.M;
            if (z) {
                SpannableStringBuilder S2 = gl.S2(k96.M0(2131751000, null));
                e1(S2);
                wbVar.setText(S2);
                return;
            }
            SpannableStringBuilder S22 = gl.S2(k96.M0(2131750999, null));
            e1(S22);
            wbVar.setText(S22);
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(gl.L(8.0f), gl.L(3.0f), gl.L(8.0f), gl.L(3.0f));
            this.M.setText(gl.S2(k96.M0(2131748008, null)));
        }
    }

    public final void g1() {
        uk1 uk1Var;
        k27 messageObject;
        int i;
        fu fuVar = this.w;
        if (fuVar == null) {
            return;
        }
        int childCount = fuVar.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i2 = Integer.MAX_VALUE;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        boolean z2 = false;
        gb2 gb2Var = null;
        View view = null;
        View view2 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.w.getChildAt(i4);
            if (childAt instanceof ob2) {
                ob2 ob2Var = (ob2) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                ob2Var.f = y;
                ob2Var.h = backgroundSizeY;
            } else if (childAt instanceof gb2) {
                gb2 gb2Var2 = (gb2) childAt;
                int top = gb2Var2.getTop();
                gb2Var2.getBottom();
                if (top >= 0) {
                    i = 0;
                } else {
                    i = -top;
                }
                int measuredHeight2 = gb2Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i + measuredHeight;
                }
                gb2Var2.D3(i, measuredHeight2 - i, (this.Y.getHeightWithKeyboard() - gl.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                k27 messageObject2 = gb2Var2.getMessageObject();
                if (this.e0 != null && messageObject2.g4() && MediaController.w().D(messageObject2)) {
                    ImageReceiver photoImage = gb2Var2.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof uk1) {
                uk1 uk1Var2 = (uk1) childAt;
                uk1Var2.k0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (uk1Var2.T()) {
                    uk1Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i2) {
                    if ((childAt instanceof gb2) || (childAt instanceof uk1)) {
                        gb2Var = childAt;
                    }
                    i2 = bottom;
                    view2 = childAt;
                }
                ef1 ef1Var = this.D0;
                if ((ef1Var == null || (!ef1Var.Z(childAt) && !this.D0.Y(childAt))) && (childAt instanceof uk1) && ((uk1) childAt).getMessageObject().l0) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i3) {
                        i3 = bottom;
                        view = childAt;
                    }
                }
            }
        }
        yc ycVar = this.e0;
        if (ycVar != null) {
            if (!z2) {
                ycVar.setTranslationY((-gl.u) - 100);
                this.fragmentView.invalidate();
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.g4() && this.W) {
                    MediaController.w().j0(false);
                }
            } else {
                MediaController.w().j0(true);
            }
        }
        if (gb2Var != null) {
            if (gb2Var instanceof gb2) {
                messageObject = gb2Var.getMessageObject();
            } else {
                messageObject = ((uk1) gb2Var).getMessageObject();
            }
            this.N.i0(messageObject.k.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof gb2) && !(view2 instanceof uk1)) {
            z = true;
        }
        this.R = z;
        if (view != null) {
            if (view.getTop() <= this.w.getPaddingTop() && !this.R) {
                if (view.getAlpha() != 0.0f) {
                    view.setAlpha(0.0f);
                }
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                if (this.N.getTag() == null) {
                    this.N.setTag(1);
                }
                if (this.N.getAlpha() != 1.0f) {
                    this.N.setAlpha(1.0f);
                }
                this.Q = true;
            } else {
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                P0(!this.R);
            }
            int bottom2 = view.getBottom() - this.w.getPaddingTop();
            if (bottom2 > this.N.getMeasuredHeight() && bottom2 < (this.N.getMeasuredHeight() << 1)) {
                this.N.setTranslationY(((-uk1Var.getMeasuredHeight()) << 1) + bottom2);
                return;
            }
            this.N.setTranslationY(0.0f);
            return;
        }
        P0(true);
        this.N.setTranslationY(0.0f);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.De));
        arrayList.add(new blb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        arrayList.add(new blb(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.z8));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Rb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ud));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vd));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.mc));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.oc));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.nc));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ff));
        arrayList.add(new blb(this.w, 131072, new Class[]{ke2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (alb) null, bkb.wf));
        View view = this.r;
        int i = bkb.bd;
        arrayList.add(new blb(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.M, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    public final void h1() {
        boolean z;
        fu fuVar = this.w;
        if (fuVar != null) {
            int childCount = fuVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.w.getChildAt(i);
                boolean z2 = true;
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    k27 messageObject = gb2Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.y()) {
                            gb2Var.setDrawSelectionBackground(false);
                            gb2Var.m3(false, true);
                            gb2Var.o3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gb2Var.setHighlighted(z);
                        if (this.H0 != Integer.MAX_VALUE) {
                            te1 te1Var = this.I0;
                            if (te1Var != null) {
                                gl.r(te1Var);
                            }
                            te1 te1Var2 = new te1(this, (byte) 0);
                            this.I0 = te1Var2;
                            gl.d3(te1Var2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.w0)) {
                            gb2Var.v3(this.w0);
                        } else {
                            gb2Var.v3(null);
                        }
                        if (this.w.getScrollState() == 0) {
                            z2 = false;
                        }
                        gb2Var.setSpoilersSuppressed(z2);
                    }
                } else if (childAt instanceof uk1) {
                    uk1 uk1Var = (uk1) childAt;
                    uk1Var.setMessageObject(uk1Var.getMessageObject());
                    if (this.w.getScrollState() == 0) {
                        z2 = false;
                    }
                    uk1Var.setSpoilersSuppressed(z2);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        kk7.e().b(this, kk7.k4);
        kk7.f(this.currentAccount).b(this, kk7.g2);
        kk7.f(this.currentAccount).b(this, kk7.f2);
        kk7.f(this.currentAccount).b(this, kk7.e2);
        kk7.f(this.currentAccount).b(this, kk7.d2);
        kk7.e().b(this, kk7.B4);
        W0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = na7.g1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new se1(this, (byte) 4)), this.classGuid);
        setBulletinDelegate(new oy((byte) 4));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.k4);
        kk7.f(this.currentAccount).n(this, kk7.g2);
        kk7.f(this.currentAccount).n(this, kk7.f2);
        kk7.f(this.currentAccount).n(this, kk7.e2);
        kk7.f(this.currentAccount).n(this, kk7.d2);
        kk7.e().n(this, kk7.B4);
        this.y0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lf1 lf1Var = this.Y;
        if (lf1Var != null) {
            brc brcVar = lf1Var.w;
            if (brcVar != null) {
                brcVar.b(false);
            }
            lf1Var.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        xf4 xf4Var = xf4.f;
        if (xf4Var != null && xf4Var.a) {
            xf4 t = xf4.t();
            if (t.a) {
                int i = bc0.G;
                ((rb0) t.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.w().o0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        lf1 lf1Var = this.Y;
        if (lf1Var != null) {
            brc brcVar = lf1Var.w;
            if (brcVar != null) {
                brcVar.b(true);
            }
            lf1Var.G = false;
        }
        this.j0 = false;
        K0(false);
        if (this.k0) {
            this.k0 = false;
            kf1 kf1Var = this.F;
            if (kf1Var != null) {
                kf1Var.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(bkb.w0(null, bkb.Yc, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.y0.e();
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.y0.d();
        }
    }
}
