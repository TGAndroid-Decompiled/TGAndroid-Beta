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
public final class vg1 extends d implements jm7 {
    public static int Q0 = 10;
    public static final int[] R0 = {nm7.T, nm7.r, nm7.s, nm7.C, nm7.G0};
    public HashMap A0;
    public boolean B0;
    public final jg1 C0;
    public mg1 D0;
    public cw6 E;
    public final ArrayList E0;
    public sg1 F;
    public final vh6 F0;
    public TextView G;
    public hg1 G0;
    public ew1 H;
    public int H0;
    public FrameLayout I;
    public bg1 I0;
    public z82 J;
    public rc2 J0;
    public LinearLayout K;
    public int K0;
    public ImageView L;
    public final ug1 L0;
    public wb M;
    public long M0;
    public cm1 N;
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
    public e02 X;
    public tg1 Y;
    public k47 Z;
    public final oz4 a;
    public TLRPC.ChannelParticipant a0;
    public final km0 b;
    public FrameLayout b0;
    public final km0 c;
    public ImageView c0;
    public final mr3 d;
    public lka d0;
    public final int e;
    public yd e0;
    public final TLRPC.Chat f;
    public jy f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final vh6 l0;
    public final vh6 m0;
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
    public fv w;
    public String w0;
    public UndoView x;
    public vh6 x0;
    public zs y;
    public final po y0;
    public final HashMap z0;

    public vg1(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new vh6();
        this.m0 = new vh6();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new po(R0);
        this.z0 = new HashMap();
        this.C0 = new jg1(this);
        this.E0 = new ArrayList();
        this.F0 = new vh6();
        this.H0 = Integer.MAX_VALUE;
        this.L0 = new ug1(this);
        this.N0 = -1;
        this.P0 = new RectF();
        sy4 sy4Var = this.glassEngine;
        sy4Var.a = new cg1(this);
        sy4Var.d = new cz4(gm.L(48.0f));
        ?? obj = new Object();
        this.a = obj;
        km0 km0Var = new km0(obj, obj, obj);
        this.b = km0Var;
        km0Var.j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && gda.f()) {
            mr3 mr3Var = new mr3(false);
            this.d = mr3Var;
            this.glassEngine.a(mr3Var);
            nz4 nz4Var = new nz4(obj);
            nz4Var.d = mr3Var;
            nz4Var.e = -3;
            nz4Var.f = obj;
            if (e86.e(262144)) {
                nz4 nz4Var2 = new nz4(obj);
                nz4Var2.d = mr3Var;
                nz4Var2.e = -2;
                nz4Var2.f = obj;
                km0 km0Var2 = new km0(nz4Var2, nz4Var2, nz4Var2);
                this.c = km0Var2;
                km0Var2.j = this.glassEngine;
                if (e86.e(262144)) {
                    L2 = gm.L(8.0f);
                } else {
                    L2 = gm.L(48.0f);
                }
                km0Var2.d = L2;
                km0Var2.e = L2;
                km0Var2.k = true;
                this.e = 0;
            } else {
                km0 km0Var3 = new km0(nz4Var, nz4Var, nz4Var);
                this.c = km0Var3;
                km0Var3.j = this.glassEngine;
                if (e86.e(262144)) {
                    L = gm.L(8.0f);
                } else {
                    L = gm.L(48.0f);
                }
                km0Var3.d = L;
                km0Var3.e = L;
                this.e = gm.L(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            km0 km0Var4 = new km0(obj, obj, obj);
            this.c = km0Var4;
            km0Var4.j = this.glassEngine;
        }
        this.f = chat;
    }

    public static a C0(vg1 vg1Var) {
        return vg1Var.actionBar;
    }

    public static a D0(vg1 vg1Var) {
        return vg1Var.actionBar;
    }

    public static a E0(vg1 vg1Var) {
        return vg1Var.actionBar;
    }

    public static int G0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static vq8 P0(CharSequence charSequence) {
        pn2[] pn2VarArr;
        if (charSequence instanceof Spannable) {
            for (pn2 pn2Var : (pn2[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), pn2.class)) {
                if (pn2Var != null) {
                    Drawable drawable = pn2Var.c;
                    if (drawable instanceof vq8) {
                        return (vq8) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void d1(int i, k47 k47Var) {
        if (k47Var == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = k47Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = k47Var.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            k47Var.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = jb6.G(i, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        k47Var.h5();
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t = gm.t(spannableStringBuilder, "\n\n");
        if (t >= 0 && Build.VERSION.SDK_INT >= 29) {
            ul1.j();
            spannableStringBuilder.setSpan(ul1.g(gm.L(8.0f)), t + 1, t + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int k0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int l0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int m0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int n0(vg1 vg1Var) {
        return vg1Var.classGuid;
    }

    public static int o0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int p0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int q0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int r0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int s0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int t0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int u0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int v0(vg1 vg1Var) {
        return vg1Var.currentAccount;
    }

    public static int w0(vg1 vg1Var) {
        return vg1Var.classGuid;
    }

    public final k47 I0(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        k47 k47Var;
        k47 k47Var2;
        String str;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            k47Var = null;
            if (i < arrayList2.size()) {
                k47Var2 = (k47) arrayList2.get(i);
                if (k47Var2 != null && k47Var2.U == 1 && k47Var2.J0 == j) {
                    break;
                }
                i++;
            } else {
                k47Var2 = null;
                break;
            }
        }
        if (k47Var2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((k47) arrayList.get(0)).k.date;
            } catch (Exception e) {
                fc4.g(e, true);
            }
            k47Var2 = new k47(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j2));
        k47Var2.U = 1;
        if (z2 && arrayList.size() > 1) {
            k47Var2.J0 = j;
        } else {
            k47Var2.J0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new x00((byte) 2)).distinct().map(new dg1(this, (byte) 0)).filter(new se((byte) 2)).limit(4L).toArray());
        if (z2) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k47.D5(jb6.G(arrayList.size(), str, join), "un1", W1));
        if (z2 && arrayList.size() > 1) {
            vq8 P0 = P0(k47Var2.v);
            int i2 = 2131750972;
            if (P0 == null) {
                if (z) {
                    i2 = 2131750973;
                }
                P0 = new vq8(jb6.M0(i2, null));
                Typeface o = gm.o();
                ho hoVar = P0.a;
                hoVar.x(o);
                hoVar.w(gm.L(10.0f));
                if (P0.c != -1) {
                    P0.c = -1;
                    P0.invalidateSelf();
                }
                P0.a(503316480);
            } else {
                ho hoVar2 = P0.a;
                if (z) {
                    i2 = 2131750973;
                }
                hoVar2.t(jb6.M0(i2, null), false, true);
            }
            P0.setBounds(0, 0, P0.getIntrinsicWidth(), gm.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new pn2(0, P0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        k47Var2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            k47Var = (k47) b10.f(1, arrayList);
        }
        if (k47Var != null) {
            long j3 = k47Var.T;
            vh6 vh6Var = this.F0;
            if (!vh6Var.d(j3)) {
                long j4 = k47Var.T;
                int i3 = Q0;
                Q0 = i3 + 1;
                vh6Var.k(Integer.valueOf(i3), j4);
            }
            k47Var2.m1 = ((Integer) vh6Var.f(k47Var.T)).intValue();
        }
        return k47Var2;
    }

    public final void J0(android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.J0(android.os.Bundle, long):void");
    }

    public final void K0(k47 k47Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        if (k47Var.D == 3) {
            heVar.U = jb6.M0(2131747912, null);
        } else {
            heVar.U = jb6.a0(null, null, 2131747939, k47Var.F0().mime_type);
        }
        showDialog(heVar);
    }

    public final void L0(boolean z) {
        int abs;
        zs zsVar = this.y;
        if (zsVar != null && !this.j0) {
            int K0 = zsVar.K0();
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
                    X0(false);
                }
            }
        }
    }

    public final boolean M0(android.view.View r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.M0(android.view.View, float, float):boolean");
    }

    public final TextureView N0(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            yd ydVar = new yd((byte) 7, getParentActivity(), this);
            this.e0 = ydVar;
            ydVar.setOutlineProvider(new xj((byte) 2));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            jy jyVar = new jy(getParentActivity());
            this.f0 = jyVar;
            jyVar.setBackgroundColor(0);
            if (z) {
                this.e0.addView(this.f0, qoe.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, qoe.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            tg1 tg1Var = this.Y;
            yd ydVar2 = this.e0;
            int i = gm.u;
            tg1Var.addView(ydVar2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void O0() {
        long j;
        k47 k47Var;
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
                k47 k47Var2 = (k47) arrayList4.get(i3);
                if (k47Var2 != null && (tL_channelAdminLogEvent2 = k47Var2.L1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j = tL_channelAdminLogEvent2.user_id;
                } else {
                    j = 0;
                }
                if (k47Var2.m1 <= 0) {
                    int i4 = Q0;
                    Q0 = i4 + 1;
                    k47Var2.m1 = i4;
                }
                int i5 = i3 + 1;
                if (i5 < arrayList4.size()) {
                    k47Var = (k47) arrayList4.get(i5);
                } else {
                    k47Var = null;
                }
                if (k47Var != null && (tL_channelAdminLogEvent = k47Var.L1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j2 = tL_channelAdminLogEvent.user_id;
                } else {
                    j2 = 0;
                }
                if (j != 0) {
                    arrayList3.add(k47Var2);
                } else {
                    arrayList2.add(k47Var2);
                }
                if (j != j2 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = k47Var2.k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((k47) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((k47) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        k47 k47Var3 = (k47) b10.f(1, arrayList3);
                        if (TextUtils.isEmpty(this.w0) && arrayList3.size() > 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Long valueOf = Long.valueOf(k47Var3.T);
                        HashSet hashSet = this.q0;
                        if (!hashSet.contains(valueOf) && z2) {
                            d1(arrayList3.size() - 1, k47Var3);
                            arrayList2.add(k47Var3);
                        } else {
                            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                d1(0, (k47) arrayList3.get(i6));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = k47Var3.k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z != z3) {
                            k47Var3.M1 = true;
                            sg1 sg1Var = this.F;
                            if (z) {
                                i = arrayList3.size() - 1;
                            } else {
                                i = 0;
                            }
                            sg1Var.g(i + size);
                            sg1 sg1Var2 = this.F;
                            if (z) {
                                i2 = arrayList3.size() - 1;
                            } else {
                                i2 = 0;
                            }
                            sg1Var2.g(size + i2 + 1);
                        }
                        long j3 = k47Var2.T;
                        arrayList = arrayList3;
                        arrayList2.add(I0(j3, k47Var2.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j3)), z2));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        k47 k47Var4 = (k47) b10.f(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(I0(k47Var4.T, k47Var4.L1.user_id, arrayList5, true, false));
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

    public final void Q0(boolean z) {
        if (this.N.getTag() != null && !this.Q) {
            if (!this.T || this.R) {
                this.N.setTag(null);
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.S = animatorSet;
                    animatorSet.setDuration(150L);
                    this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
                    this.S.addListener(new b91(this, (byte) 4));
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

    public final void R0(int i) {
        mr3 mr3Var;
        if (Build.VERSION.SDK_INT >= 31 && (mr3Var = this.d) != null) {
            if (iqd.a(i, 4)) {
                bz4 e = this.glassEngine.e();
                e.b(this.w.getY(), this.Y.getWidth(), this.w.getY() + this.w.getHeight());
                mr3Var.h(e);
            }
            tg1 tg1Var = this.Y;
            Objects.requireNonNull(tg1Var);
            mr3Var.e(new ms0(tg1Var, (byte) 2), this.Y.getWidth(), this.Y.getHeight());
        }
    }

    public final void S0(int r21, java.util.ArrayList r22, java.lang.Integer r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.S0(int, java.util.ArrayList, java.lang.Integer):void");
    }

    public final void T0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        int i;
        boolean z;
        boolean z2;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && getParentActivity() != null) {
            int i2 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232581, 0, getResourceProvider(), getParentActivity());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(gm.L(200.0f));
            Rect rect = new Rect();
            getParentActivity().getResources().getDrawable(2131232581).mutate().getPadding(rect);
            anb.h(cmb.F8, getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                if (arrayList4.get(i3) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new j8(getParentActivity(), getResourceProvider()), qoe.o(-1, 8));
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
                    a8Var.setMinimumWidth(gm.L(200.0f));
                    a8Var.j((CharSequence) arrayList2.get(i3), ((Integer) arrayList3.get(i3)).intValue(), null);
                    if (((Integer) arrayList4.get(i3)).intValue() == 35) {
                        a8Var.d(getThemedColor(cmb.p7), getThemedColor(cmb.o7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                    a8Var.setOnClickListener(new ph(this, i3, arrayList4, (Integer) arrayList4.get(i3), (byte) 1));
                }
                i3++;
                arrayList4 = arrayList;
            }
            gg1 gg1Var = new gg1(this, this.Y.getContext(), (byte) 0);
            gg1Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            gg1Var.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            hg1 hg1Var = new hg1(this, gg1Var);
            this.G0 = hg1Var;
            hg1Var.e = true;
            hg1Var.c = (short) 220;
            hg1Var.setOutsideTouchable(true);
            this.G0.setClippingEnabled(true);
            this.G0.setAnimationStyle(2131755192);
            this.G0.setFocusable(true);
            gg1Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
            this.G0.setInputMethodMode(2);
            this.G0.setSoftInputMode(48);
            this.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f)) - gg1Var.getMeasuredWidth()) + rect.left) - gm.L(28.0f);
            if (left < gm.L(6.0f)) {
                left = gm.L(6.0f);
            } else if (left > (this.w.getMeasuredWidth() - gm.L(6.0f)) - gg1Var.getMeasuredWidth()) {
                left = (this.w.getMeasuredWidth() - gm.L(6.0f)) - gg1Var.getMeasuredWidth();
            }
            if (gm.O1()) {
                int[] iArr = new int[2];
                this.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = this.Y.getHeight();
            int L = gm.L(48.0f) + gg1Var.getMeasuredHeight();
            int Q = this.Y.Q();
            if (Q > gm.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                i = (int) (this.w.getY() + view.getTop() + f2);
                if ((L - rect.top) - rect.bottom > gm.L(240.0f)) {
                    i += gm.L(240.0f) - L;
                }
                if (i < this.w.getY() + gm.L(24.0f)) {
                    i = (int) (this.w.getY() + gm.L(24.0f));
                } else {
                    int i4 = height - L;
                    if (i > i4 - gm.L(8.0f)) {
                        i = i4 - gm.L(8.0f);
                    }
                }
            } else {
                if (!this.inBubbleMode) {
                    i2 = gm.m;
                }
                i = i2;
            }
            gg1Var.setMaxHeight(height - i);
            this.G0.showAtLocation(this.w, 51, left, i);
            this.G0.b();
        }
    }

    public final void U0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull M0;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().d4(tL_channels_channelParticipants.users, false);
            getMessagesController().X3(tL_channels_channelParticipants.chats, false);
            this.u0 = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.f;
            if (chat != null && (M0 = getMessagesController().M0(chat.id)) != null && M0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = getMessagesController().L3;
                channelParticipant.peer = getMessagesController().x1(channelParticipant.user_id);
                long j = getMessagesController().L3;
                if (getMessagesController().W1(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new ag1(this, (byte) 1));
                }
                this.u0.add(0, channelParticipant);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof ib) {
                ((ib) dialog).Z0(this.u0);
            }
        }
    }

    public final void V0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        k47 k47Var;
        int i = 0;
        this.D0.N = false;
        a1(false);
        oc7.r1(this.currentAccount).d4(tL_channels_adminLogResults.users, false);
        oc7.r1(this.currentAccount).X3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = this.o0;
        boolean z = false;
        for (int i2 = 0; i2 < tL_channels_adminLogResults.events.size(); i2++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            long j = tL_channelAdminLogEvent.id;
            vh6 vh6Var = this.l0;
            if (vh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent.id);
                k47 k47Var2 = new k47(this.currentAccount, tL_channelAdminLogEvent, arrayList, this.n0, this.f, this.U, false);
                if (k47Var2.U >= 0) {
                    vh6Var.k(k47Var2, tL_channelAdminLogEvent.id);
                }
                z = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            k47 k47Var3 = (k47) arrayList.get(size);
            if (k47Var3 != null && k47Var3.U != 0 && k47Var3.L1() >= 0) {
                this.m0.k(k47Var3, k47Var3.L1());
            }
            if (k47Var3 != null && (message = k47Var3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (size != i3) {
                                k47Var = (k47) arrayList.get(i3);
                                if (k47Var.U != 1 && k47Var.L1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            k47Var = null;
                            break;
                        }
                    }
                    if (k47Var != null) {
                        k47Var3.C = k47Var;
                    }
                }
                arrayList2.add(k47Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            hs6.d0(this.currentAccount).Y0(arrayList2, -this.f.id, 0, 0L, new bg1(this, (byte) 1), getClassGuid(), null);
        }
        O0();
        this.s0 = false;
        if (!z) {
            this.r0 = true;
        }
        gm.T3(this.n, false, 0.3f, true, true);
        this.w.setEmptyView(this.I);
        sg1 sg1Var = this.F;
        if (sg1Var != null) {
            sg1Var.f();
        }
        r7 r7Var = this.O;
        if (r7Var != null) {
            if (this.p0.isEmpty() && TextUtils.isEmpty(this.w0)) {
                i = 8;
            }
            r7Var.setVisibility(i);
        }
    }

    public final void W0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.t0 = false;
        this.D0.N = false;
        a1(false);
        oc7.r1(this.currentAccount).d4(tL_channels_adminLogResults.users, false);
        oc7.r1(this.currentAccount).X3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            vh6 vh6Var = this.l0;
            if (vh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent2.id);
                k47 k47Var = new k47(this.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, this.f, this.U, false);
                if (k47Var.U >= 0 && (((tL_channelAdminLogEvent = k47Var.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !vh6Var.d(tL_channelAdminLogEvent2.id))) {
                    this.o0.add(0, k47Var);
                    vh6Var.k(k47Var, tL_channelAdminLogEvent2.id);
                    z = true;
                }
            }
        }
        if (this.F != null && z) {
            O0();
            this.F.f();
        }
    }

    public final void X0(boolean z) {
        sg1 sg1Var;
        if (!this.s0) {
            ArrayList arrayList = this.o0;
            if (z) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.n;
                if (frameLayout != null) {
                    gm.T3(frameLayout, true, 0.3f, true, true);
                    this.I.setVisibility(4);
                    this.w.setEmptyView(null);
                }
                this.l0.b();
                arrayList.clear();
                this.n0.clear();
                O0();
            }
            this.s0 = true;
            TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
            tL_channels_getAdminLog.channel = oc7.h1(this.f);
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
                    tL_channels_getAdminLog.admins.add(oc7.r1(this.currentAccount).p1((TLRPC.User) this.x0.n(i)));
                }
            }
            g1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ag1(this, (byte) 3));
            if (z && (sg1Var = this.F) != null) {
                sg1Var.f();
            }
        }
    }

    public final void Y0() {
        if (this.w != null && !this.o0.isEmpty()) {
            this.y.g1(this.p0.size() - 1, (-100000) - this.w.getPaddingTop());
        }
    }

    public final void Z0() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = oc7.h1(this.f);
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
                tL_channels_getAdminLog.admins.add(oc7.r1(this.currentAccount).p1((TLRPC.User) this.x0.n(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ag1(this, (byte) 0));
    }

    public final void a1(boolean z) {
        int i;
        long j;
        fv fvVar = this.w;
        if (fvVar != null && this.y != null && fvVar.getChildCount() > 0) {
            if (z) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
            rc2 rc2Var = null;
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
                        rc2Var = childAt;
                        i2 = R;
                    } else {
                        if (top <= i) {
                        }
                        i = childAt.getTop();
                        rc2Var = childAt;
                        i2 = R;
                    }
                }
            }
            if (rc2Var != null) {
                if (rc2Var instanceof rc2) {
                    j = rc2Var.getMessageObject().T;
                } else if (rc2Var instanceof cm1) {
                    j = rc2Var.getMessageObject().T;
                } else {
                    j = 0;
                }
                this.M0 = j;
                this.N0 = i2;
                this.O0 = (this.w.getMeasuredHeight() - rc2Var.getBottom()) - this.w.getPaddingBottom();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.vf));
        hashSet.add(Integer.valueOf(cmb.uf));
        hashSet.add(Integer.valueOf(cmb.Fc));
        hashSet.add(Integer.valueOf(cmb.gf));
        hashSet.add(Integer.valueOf(cmb.Hc));
        hashSet.add(Integer.valueOf(cmb.Gc));
        hashSet.add(Integer.valueOf(cmb.jf));
        hashSet.add(Integer.valueOf(cmb.hf));
        hashSet.add(Integer.valueOf(cmb.ld));
        hashSet.add(Integer.valueOf(cmb.Ze));
        hashSet.add(Integer.valueOf(cmb.kd));
        hashSet.add(Integer.valueOf(cmb.Ye));
        hashSet.add(Integer.valueOf(cmb.Gb));
        hashSet.add(Integer.valueOf(cmb.Ec));
        hashSet.add(Integer.valueOf(cmb.Fb));
        hashSet.add(Integer.valueOf(cmb.Dc));
        hashSet.add(Integer.valueOf(cmb.Qb));
        hashSet.add(Integer.valueOf(cmb.Kd));
        hashSet.add(Integer.valueOf(cmb.Ae));
        hashSet.add(Integer.valueOf(cmb.Bc));
        hashSet.add(Integer.valueOf(cmb.ze));
        hashSet.add(Integer.valueOf(cmb.Ac));
        hashSet.add(Integer.valueOf(cmb.ye));
        hashSet.add(Integer.valueOf(cmb.zc));
        hashSet.add(Integer.valueOf(cmb.xe));
        hashSet.add(Integer.valueOf(cmb.yc));
        hashSet.add(Integer.valueOf(cmb.we));
        hashSet.add(Integer.valueOf(cmb.xc));
        hashSet.add(Integer.valueOf(cmb.ve));
        hashSet.add(Integer.valueOf(cmb.wc));
        hashSet.add(Integer.valueOf(cmb.ue));
        hashSet.add(Integer.valueOf(cmb.vc));
        hashSet.add(Integer.valueOf(cmb.te));
        hashSet.add(Integer.valueOf(cmb.uc));
        hashSet.add(Integer.valueOf(cmb.se));
        hashSet.add(Integer.valueOf(cmb.tc));
        hashSet.add(Integer.valueOf(cmb.re));
        hashSet.add(Integer.valueOf(cmb.sc));
        hashSet.add(Integer.valueOf(cmb.qe));
        hashSet.add(Integer.valueOf(cmb.rc));
        hashSet.add(Integer.valueOf(cmb.pe));
        hashSet.add(Integer.valueOf(cmb.qc));
        hashSet.add(Integer.valueOf(cmb.oe));
        hashSet.add(Integer.valueOf(cmb.pc));
        hashSet.add(Integer.valueOf(cmb.le));
        hashSet.add(Integer.valueOf(cmb.ne));
        hashSet.add(Integer.valueOf(cmb.me));
        hashSet.add(Integer.valueOf(cmb.ke));
        hashSet.add(Integer.valueOf(cmb.lc));
        hashSet.add(Integer.valueOf(cmb.je));
        hashSet.add(Integer.valueOf(cmb.kc));
        hashSet.add(Integer.valueOf(cmb.ie));
        hashSet.add(Integer.valueOf(cmb.jc));
        hashSet.add(Integer.valueOf(cmb.he));
        hashSet.add(Integer.valueOf(cmb.bc));
        hashSet.add(Integer.valueOf(cmb.fe));
        hashSet.add(Integer.valueOf(cmb.dc));
        hashSet.add(Integer.valueOf(cmb.ee));
        hashSet.add(Integer.valueOf(cmb.ic));
        hashSet.add(Integer.valueOf(cmb.de));
        hashSet.add(Integer.valueOf(cmb.ae));
        hashSet.add(Integer.valueOf(cmb.hc));
        hashSet.add(Integer.valueOf(cmb.Zd));
        hashSet.add(Integer.valueOf(cmb.gc));
        hashSet.add(Integer.valueOf(cmb.Yd));
        hashSet.add(Integer.valueOf(cmb.Xd));
        hashSet.add(Integer.valueOf(cmb.Xb));
        hashSet.add(Integer.valueOf(cmb.Td));
        hashSet.add(Integer.valueOf(cmb.Wb));
        hashSet.add(Integer.valueOf(cmb.Sd));
        hashSet.add(Integer.valueOf(cmb.Rd));
        hashSet.add(Integer.valueOf(cmb.Vb));
        hashSet.add(Integer.valueOf(cmb.Qd));
        hashSet.add(Integer.valueOf(cmb.Ub));
        hashSet.add(Integer.valueOf(cmb.Pd));
        hashSet.add(Integer.valueOf(cmb.Tb));
        hashSet.add(Integer.valueOf(cmb.Od));
        hashSet.add(Integer.valueOf(cmb.Nd));
        hashSet.add(Integer.valueOf(cmb.Ld));
        hashSet.add(Integer.valueOf(cmb.Hd));
        hashSet.add(Integer.valueOf(cmb.Pb));
        hashSet.add(Integer.valueOf(cmb.Gd));
        hashSet.add(Integer.valueOf(cmb.Ob));
        hashSet.add(Integer.valueOf(cmb.Ed));
        hashSet.add(Integer.valueOf(cmb.Dd));
        hashSet.add(Integer.valueOf(cmb.Cd));
        hashSet.add(Integer.valueOf(cmb.Bd));
        hashSet.add(Integer.valueOf(cmb.Nb));
        hashSet.add(Integer.valueOf(cmb.Ad));
        hashSet.add(Integer.valueOf(cmb.zd));
        hashSet.add(Integer.valueOf(cmb.yd));
        hashSet.add(Integer.valueOf(cmb.wd));
        hashSet.add(Integer.valueOf(cmb.vd));
        hashSet.add(Integer.valueOf(cmb.pa));
        hashSet.add(Integer.valueOf(cmb.q7));
        hashSet.add(Integer.valueOf(cmb.yb));
        hashSet.add(Integer.valueOf(cmb.ud));
        hashSet.add(Integer.valueOf(cmb.td));
        hashSet.add(Integer.valueOf(cmb.Mb));
        hashSet.add(Integer.valueOf(cmb.Lb));
        hashSet.add(Integer.valueOf(cmb.sd));
        hashSet.add(Integer.valueOf(cmb.rd));
        hashSet.add(Integer.valueOf(cmb.qd));
        hashSet.add(Integer.valueOf(cmb.Kb));
        hashSet.add(Integer.valueOf(cmb.Jb));
        hashSet.add(Integer.valueOf(cmb.pd));
        hashSet.add(Integer.valueOf(cmb.od));
        hashSet.add(Integer.valueOf(cmb.nd));
        hashSet.add(Integer.valueOf(cmb.Ib));
        hashSet.add(Integer.valueOf(cmb.Hb));
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.Xc));
        hashSet.add(Integer.valueOf(cmb.Wc));
        hashSet.add(Integer.valueOf(cmb.Vc));
        hashSet.add(Integer.valueOf(cmb.Uc));
        hashSet.add(Integer.valueOf(cmb.cd));
        hashSet.add(Integer.valueOf(cmb.bd));
        hashSet.add(Integer.valueOf(cmb.ad));
        hashSet.add(Integer.valueOf(cmb.Zc));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.vb));
        hashSet.add(Integer.valueOf(cmb.ub));
        hashSet.add(Integer.valueOf(cmb.tb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.sb));
        hashSet.add(Integer.valueOf(cmb.sa));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.n8));
        hashSet.add(Integer.valueOf(cmb.m8));
        hashSet.add(Integer.valueOf(cmb.l8));
        hashSet.add(Integer.valueOf(cmb.k8));
        hashSet.add(Integer.valueOf(cmb.j8));
        hashSet.add(Integer.valueOf(cmb.i8));
        hashSet.add(Integer.valueOf(cmb.h8));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.A8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final int b1(k47 k47Var) {
        rc2 rc2Var = this.J0;
        if (rc2Var != null) {
            rc2Var.td = 0;
            rc2Var.ud = null;
        }
        return 0;
    }

    public final void c1(defpackage.k47 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.c1(k47):void");
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new rc2(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        cmb.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!gm.O1());
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 20));
        z82 z82Var = new z82(context, null, false, null);
        this.J = z82Var;
        mt1 mt1Var = z82Var.h;
        if (mt1Var != null) {
            mt1Var.setTextSizePx(gm.L(17.5f));
        }
        mt1 mt1Var2 = z82Var.r;
        if (mt1Var2 != null) {
            mt1Var2.setTextSizePx(gm.L(13.5f));
        }
        z82Var.m0 = true;
        this.J.setOccupyStatusBar(!gm.O1());
        this.actionBar.addView(this.J, 0, qoe.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        r7 a = this.actionBar.t().a(0, 2131232503);
        a.N();
        a.I = new q20(this, (byte) 1);
        this.O = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        z82 z82Var2 = this.J;
        TLRPC.Chat chat = this.f;
        z82Var2.setTitle(chat.title);
        this.J.setSubtitle(jb6.M0(2131751011, null));
        this.J.setChatAvatar(chat);
        lg1 lg1Var = new lg1(this, context);
        this.fragmentView = lg1Var;
        this.Y = lg1Var;
        lg1Var.setOccupyStatusBar(!gm.O1());
        this.Y.U(cmb.r0());
        a aVar = this.actionBar;
        pm0 o = qqd.o(this.resourceProvider);
        km0 km0Var = this.c;
        aVar.P(km0Var, o, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, qoe.e(-1, -2, 17));
        this.I.setOnTouchListener(new p8((byte) 24));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new slb(this.M, this.Y, gm.L(12.0f), cmb.e2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(2131231616);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, qoe.t(54, 54, 17, 16, 20, 16, -4));
        wb wbVar = new wb(context, (byte) 14);
        this.M = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        wb wbVar2 = this.M;
        int i2 = cmb.Yc;
        anb.X(wbVar2, i2, null);
        this.M.setPadding(gm.L(8.0f), gm.L(5.0f), gm.L(8.0f), gm.L(5.0f));
        this.K.addView(this.M, qoe.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, qoe.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        fv fvVar = new fv((byte) 5, context, this);
        this.w = fvVar;
        fvVar.setOnItemClickListener(new ni6(this, (byte) 15));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        fv fvVar2 = this.w;
        sg1 sg1Var = new sg1(this, context);
        this.F = sg1Var;
        fvVar2.setAdapter(sg1Var);
        this.w.setClipToPadding(false);
        fv fvVar3 = this.w;
        int i3 = gm.m;
        int i4 = this.e;
        fvVar3.setPadding(0, gm.L(4.0f) + a.getCurrentActionBarHeight() + i3 + i4, 0, gm.L(60.0f) + i4 + gm.n);
        fv fvVar4 = this.w;
        mg1 mg1Var = new mg1(this, this.w, this.resourceProvider);
        this.D0 = mg1Var;
        fvVar4.setItemAnimator(mg1Var);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        zs zsVar = new zs(this);
        this.y = zsVar;
        zsVar.i1(1);
        this.y.k1(true);
        this.w.setLayoutManager(this.y);
        cw6 cw6Var = new cw6(this.w, this.y);
        this.E = cw6Var;
        cw6Var.n = new cg1(this);
        cw6Var.r = this.L0;
        this.Y.addView(this.w, qoe.c(-1.0f, -1));
        this.w.setOnScrollListener(new y(this));
        this.glassEngine.b(this.w);
        int i5 = this.h0;
        if (i5 != -1) {
            this.y.g1(i5, this.i0);
            this.h0 = -1;
        }
        e02 e02Var = new e02(context);
        this.X = e02Var;
        e02Var.setup(this.b);
        this.X.setFadeZoneTop(gm.L(2.0f) + a.getCurrentActionBarHeight() + gm.m);
        this.X.setFadeHeightTop(gm.L(60.0f));
        this.X.setFadeZoneBottom(gm.L(7.0f) + gm.L(44.0f) + gm.L(9.0f) + gm.n);
        this.X.setFadeHeightBottom(gm.L(60.0f));
        this.Y.addView(this.X, qoe.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, qoe.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new slb(this.r, this.Y, gm.L(18.0f), cmb.e2));
        this.n.addView(this.r, qoe.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gm.L(28.0f));
        this.s.setProgressColor(cmb.w0(null, i2, false));
        this.n.addView(this.s, qoe.e(32, 32, 17));
        cm1 cm1Var = new cm1(context);
        this.N = cm1Var;
        cm1Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, qoe.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        ylb ylbVar = this.resourceProvider;
        ew1 ew1Var = new ew1(context, ylbVar, qqd.b(ylbVar), km0Var);
        this.H = ew1Var;
        ew1Var.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-gm.n);
        this.H.c(4, true, false);
        ew1 ew1Var2 = this.H;
        im0 c = ew1Var2.n.c(ew1Var2, null, false);
        c.p(ew1Var2.r);
        wi8.r(c, gm.L(22.0f), 6.0f);
        ew1Var2.w = c;
        this.Y.addView(this.H, qoe.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final vg1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vg1 vg1Var = this.b;
                switch (b) {
                    case 0:
                        if (vg1Var.getParentActivity() != null) {
                            ib ibVar = new ib(vg1Var, vg1Var.v0, vg1Var.x0, vg1Var.f.megagroup);
                            ibVar.Z0(vg1Var.u0);
                            ibVar.b2 = new cg1(vg1Var);
                            vg1Var.showDialog(ibVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        boolean z = vg1Var.f.megagroup;
                        he heVar = alertDialog$Builder.a;
                        if (z) {
                            heVar.U = gm.S2(jb6.M0(2131750914, null));
                        } else {
                            heVar.U = gm.S2(jb6.M0(2131750913, null));
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.S = jb6.M0(2131750912, null);
                        vg1Var.showDialog(heVar);
                        return;
                    default:
                        if (vg1Var.getParentActivity() != null) {
                            gm.t1(vg1Var.O.getSearchField());
                            vg1Var.showDialog((my0) ik.o(vg1Var.getParentActivity(), new zf1(vg1Var, (byte) 0), null).b);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(gm.o());
        anb.X(this.G, cmb.rf, null);
        this.G.setText(jb6.M0(2131745717, null));
        this.G.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
        this.H.getContainer().addView(this.G, qoe.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) {
            public final vg1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vg1 vg1Var = this.b;
                switch (b) {
                    case 0:
                        if (vg1Var.getParentActivity() != null) {
                            ib ibVar = new ib(vg1Var, vg1Var.v0, vg1Var.x0, vg1Var.f.megagroup);
                            ibVar.Z0(vg1Var.u0);
                            ibVar.b2 = new cg1(vg1Var);
                            vg1Var.showDialog(ibVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        boolean z = vg1Var.f.megagroup;
                        he heVar = alertDialog$Builder.a;
                        if (z) {
                            heVar.U = gm.S2(jb6.M0(2131750914, null));
                        } else {
                            heVar.U = gm.S2(jb6.M0(2131750913, null));
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.S = jb6.M0(2131750912, null);
                        vg1Var.showDialog(heVar);
                        return;
                    default:
                        if (vg1Var.getParentActivity() != null) {
                            gm.t1(vg1Var.O.getSearchField());
                            vg1Var.showDialog((my0) ik.o(vg1Var.getParentActivity(), new zf1(vg1Var, (byte) 0), null).b);
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
        this.b0.setPadding(0, gm.L(3.0f), 0, 0);
        this.Y.addView(this.b0, qoe.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(2131232082);
        anb.s(this.c0, cmb.of, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, qoe.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) {
            public final vg1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                vg1 vg1Var = this.b;
                switch (b) {
                    case 0:
                        if (vg1Var.getParentActivity() != null) {
                            ib ibVar = new ib(vg1Var, vg1Var.v0, vg1Var.x0, vg1Var.f.megagroup);
                            ibVar.Z0(vg1Var.u0);
                            ibVar.b2 = new cg1(vg1Var);
                            vg1Var.showDialog(ibVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        boolean z = vg1Var.f.megagroup;
                        he heVar = alertDialog$Builder.a;
                        if (z) {
                            heVar.U = gm.S2(jb6.M0(2131750914, null));
                        } else {
                            heVar.U = gm.S2(jb6.M0(2131750913, null));
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.S = jb6.M0(2131750912, null);
                        vg1Var.showDialog(heVar);
                        return;
                    default:
                        if (vg1Var.getParentActivity() != null) {
                            gm.t1(vg1Var.O.getSearchField());
                            vg1Var.showDialog((my0) ik.o(vg1Var.getParentActivity(), new zf1(vg1Var, (byte) 0), null).b);
                            return;
                        }
                        return;
                }
            }
        });
        lka lkaVar = new lka(context);
        this.d0 = lkaVar;
        anb.W(lkaVar, cmb.pf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(gm.o());
        this.b0.addView(this.d0, qoe.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            gm.T3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            gm.T3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        fv fvVar5 = this.w;
        fvVar5.X1 = true;
        fvVar5.Y1 = true;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(gm.L(51.0f));
        this.Y.addView(this.x, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        rc2 rc2Var;
        k47 messageObject;
        rc2 rc2Var2;
        k47 messageObject2;
        rc2 rc2Var3;
        k47 messageObject3;
        boolean z;
        if (i == nm7.m4) {
            fv fvVar = this.w;
            if (fvVar != null) {
                fvVar.h1();
                return;
            }
            return;
        }
        if (i == nm7.h2) {
            if (((k47) objArr[0]).g4()) {
                MediaController.w().o0(N0(true), this.f0, this.e0, true);
                int childCount = this.w.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        View childAt = this.w.getChildAt(i3);
                        if (childAt instanceof rc2) {
                            rc2 rc2Var4 = (rc2) childAt;
                            k47 messageObject4 = rc2Var4.getMessageObject();
                            if (this.e0 != null && messageObject4.g4() && MediaController.w().D(messageObject4)) {
                                ImageReceiver photoImage = rc2Var4.getPhotoImage();
                                this.e0.setTranslationX(photoImage.L0);
                                this.e0.setTranslationY(rc2Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
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
                    k47 k47Var = MediaController.w().v0;
                    if (!z) {
                        this.e0.setTranslationY((-gm.u) - 100);
                        this.fragmentView.invalidate();
                        if (k47Var != null && k47Var.g4() && (this.W || PipRoundVideoView.G != null)) {
                            MediaController.w().j0(false);
                        }
                    } else {
                        MediaController.w().j0(true);
                    }
                }
            }
            fv fvVar2 = this.w;
            if (fvVar2 != null) {
                int childCount2 = fvVar2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.w.getChildAt(i4);
                    if ((childAt2 instanceof rc2) && (messageObject3 = (rc2Var3 = (rc2) childAt2).getMessageObject()) != null) {
                        if (!k47.Q4(messageObject3.k) && !messageObject3.I3()) {
                            if (messageObject3.g4()) {
                                rc2Var3.o0(null, false);
                                if (!MediaController.w().D(messageObject3) && messageObject3.b0 != 0.0f) {
                                    messageObject3.F5();
                                    rc2Var3.invalidate();
                                }
                            }
                        } else {
                            rc2Var3.R3(false, true, false);
                        }
                    }
                }
            }
        } else if (i != nm7.f2 && i != nm7.g2) {
            if (i == nm7.e2) {
                Integer num = (Integer) objArr[0];
                fv fvVar3 = this.w;
                if (fvVar3 != null) {
                    int childCount3 = fvVar3.getChildCount();
                    for (int i5 = 0; i5 < childCount3; i5++) {
                        View childAt3 = this.w.getChildAt(i5);
                        if ((childAt3 instanceof rc2) && (messageObject2 = (rc2Var2 = (rc2) childAt3).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                            k47 k47Var2 = MediaController.w().v0;
                            if (k47Var2 != null) {
                                messageObject2.b0 = k47Var2.b0;
                                messageObject2.i0 = k47Var2.i0;
                                messageObject2.j0 = k47Var2.j0;
                                rc2Var2.W3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i == nm7.D4 && this.fragmentView != null) {
                this.Y.U(cmb.r0());
                this.r.invalidate();
                wb wbVar = this.M;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                this.w.h1();
            }
        } else {
            fv fvVar4 = this.w;
            if (fvVar4 != null) {
                int childCount4 = fvVar4.getChildCount();
                for (int i6 = 0; i6 < childCount4; i6++) {
                    View childAt4 = this.w.getChildAt(i6);
                    if ((childAt4 instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt4).getMessageObject()) != null) {
                        if (!k47.Q4(messageObject.k) && !messageObject.I3()) {
                            if (messageObject.g4() && !MediaController.w().D(messageObject)) {
                                rc2Var.o0(null, true);
                            }
                        } else {
                            rc2Var.R3(false, true, false);
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

    public final void e1(TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        oc7 messagesController = getMessagesController();
        TLRPC.Chat chat = this.f;
        TLRPC.ChatFull M0 = messagesController.M0(chat.id);
        xs5 xs5Var = new xs5(this.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, M0, hashMap, this, M0.id, false, sd2.T(chat));
        xs5Var.d2 = new kg1(this);
        xs5Var.show();
    }

    public final void g1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(gm.L(8.0f), gm.L(3.0f), gm.L(8.0f), gm.L(3.0f));
            this.M.setText(gm.S2(jb6.M0(2131747935, null)));
        } else if (this.x0 == null && this.v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
            boolean z = this.f.megagroup;
            wb wbVar = this.M;
            if (z) {
                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131750949, null));
                f1(S2);
                wbVar.setText(S2);
                return;
            }
            SpannableStringBuilder S22 = gm.S2(jb6.M0(2131750948, null));
            f1(S22);
            wbVar.setText(S22);
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(gm.L(8.0f), gm.L(3.0f), gm.L(8.0f), gm.L(3.0f));
            this.M.setText(gm.S2(jb6.M0(2131747934, null)));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.De));
        arrayList.add(new cnb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        arrayList.add(new cnb(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.z8));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Rb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ud));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vd));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zb));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.mc));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oc));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.nc));
        arrayList.add(new cnb(this.w, 0, new Class[]{rc2.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ff));
        arrayList.add(new cnb(this.w, 131072, new Class[]{vf2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (bnb) null, cmb.wf));
        View view = this.r;
        int i = cmb.bd;
        arrayList.add(new cnb(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.M, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    public final void h1() {
        cm1 cm1Var;
        k47 messageObject;
        int i;
        fv fvVar = this.w;
        if (fvVar == null) {
            return;
        }
        int childCount = fvVar.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i2 = Integer.MAX_VALUE;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        boolean z2 = false;
        rc2 rc2Var = null;
        View view = null;
        View view2 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.w.getChildAt(i4);
            if (childAt instanceof zc2) {
                zc2 zc2Var = (zc2) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                zc2Var.f = y;
                zc2Var.h = backgroundSizeY;
            } else if (childAt instanceof rc2) {
                rc2 rc2Var2 = (rc2) childAt;
                int top = rc2Var2.getTop();
                rc2Var2.getBottom();
                if (top >= 0) {
                    i = 0;
                } else {
                    i = -top;
                }
                int measuredHeight2 = rc2Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i + measuredHeight;
                }
                rc2Var2.D3(i, measuredHeight2 - i, (this.Y.getHeightWithKeyboard() - gm.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                k47 messageObject2 = rc2Var2.getMessageObject();
                if (this.e0 != null && messageObject2.g4() && MediaController.w().D(messageObject2)) {
                    ImageReceiver photoImage = rc2Var2.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof cm1) {
                cm1 cm1Var2 = (cm1) childAt;
                cm1Var2.j0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (cm1Var2.Q()) {
                    cm1Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i2) {
                    if ((childAt instanceof rc2) || (childAt instanceof cm1)) {
                        rc2Var = childAt;
                    }
                    i2 = bottom;
                    view2 = childAt;
                }
                mg1 mg1Var = this.D0;
                if ((mg1Var == null || (!mg1Var.Z(childAt) && !this.D0.Y(childAt))) && (childAt instanceof cm1) && ((cm1) childAt).getMessageObject().l0) {
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
        yd ydVar = this.e0;
        if (ydVar != null) {
            if (!z2) {
                ydVar.setTranslationY((-gm.u) - 100);
                this.fragmentView.invalidate();
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.g4() && this.W) {
                    MediaController.w().j0(false);
                }
            } else {
                MediaController.w().j0(true);
            }
        }
        if (rc2Var != null) {
            if (rc2Var instanceof rc2) {
                messageObject = rc2Var.getMessageObject();
            } else {
                messageObject = ((cm1) rc2Var).getMessageObject();
            }
            this.N.h0(messageObject.k.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof rc2) && !(view2 instanceof cm1)) {
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
                Q0(!this.R);
            }
            int bottom2 = view.getBottom() - this.w.getPaddingTop();
            if (bottom2 > this.N.getMeasuredHeight() && bottom2 < (this.N.getMeasuredHeight() << 1)) {
                this.N.setTranslationY(((-cm1Var.getMeasuredHeight()) << 1) + bottom2);
                return;
            }
            this.N.setTranslationY(0.0f);
            return;
        }
        Q0(true);
        this.N.setTranslationY(0.0f);
    }

    public final void i1() {
        boolean z;
        fv fvVar = this.w;
        if (fvVar != null) {
            int childCount = fvVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.w.getChildAt(i);
                boolean z2 = true;
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    k47 messageObject = rc2Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.y()) {
                            rc2Var.setDrawSelectionBackground(false);
                            rc2Var.m3(false, true);
                            rc2Var.o3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        rc2Var.setHighlighted(z);
                        if (this.H0 != Integer.MAX_VALUE) {
                            bg1 bg1Var = this.I0;
                            if (bg1Var != null) {
                                gm.r(bg1Var);
                            }
                            bg1 bg1Var2 = new bg1(this, (byte) 0);
                            this.I0 = bg1Var2;
                            gm.d3(bg1Var2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.w0)) {
                            rc2Var.v3(this.w0);
                        } else {
                            rc2Var.v3(null);
                        }
                        if (this.w.getScrollState() == 0) {
                            z2 = false;
                        }
                        rc2Var.setSpoilersSuppressed(z2);
                    }
                } else if (childAt instanceof cm1) {
                    cm1 cm1Var = (cm1) childAt;
                    cm1Var.setMessageObject(cm1Var.getMessageObject());
                    if (this.w.getScrollState() == 0) {
                        z2 = false;
                    }
                    cm1Var.setSpoilersSuppressed(z2);
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
        nm7.e().b(this, nm7.m4);
        nm7.f(this.currentAccount).b(this, nm7.h2);
        nm7.f(this.currentAccount).b(this, nm7.g2);
        nm7.f(this.currentAccount).b(this, nm7.f2);
        nm7.f(this.currentAccount).b(this, nm7.e2);
        nm7.e().b(this, nm7.D4);
        X0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = oc7.h1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ag1(this, (byte) 4)), this.classGuid);
        setBulletinDelegate(new oz((byte) 4));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.m4);
        nm7.f(this.currentAccount).n(this, nm7.h2);
        nm7.f(this.currentAccount).n(this, nm7.g2);
        nm7.f(this.currentAccount).n(this, nm7.f2);
        nm7.f(this.currentAccount).n(this, nm7.e2);
        nm7.e().n(this, nm7.D4);
        this.y0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        tg1 tg1Var = this.Y;
        if (tg1Var != null) {
            dtc dtcVar = tg1Var.w;
            if (dtcVar != null) {
                dtcVar.b(false);
            }
            tg1Var.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        yh4 yh4Var = yh4.f;
        if (yh4Var != null && yh4Var.a) {
            yh4 t = yh4.t();
            if (t.a) {
                int i = bd0.G;
                ((rc0) t.d).b(false);
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
        tg1 tg1Var = this.Y;
        if (tg1Var != null) {
            dtc dtcVar = tg1Var.w;
            if (dtcVar != null) {
                dtcVar.b(true);
            }
            tg1Var.G = false;
        }
        this.j0 = false;
        L0(false);
        if (this.k0) {
            this.k0 = false;
            sg1 sg1Var = this.F;
            if (sg1Var != null) {
                sg1Var.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(cmb.w0(null, cmb.Yc, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
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
