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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class wf1 extends e implements fn7 {
    public static int Q0 = 10;
    public static final int[] R0 = {jn7.T, jn7.r, jn7.s, jn7.C, jn7.G0};
    public HashMap A0;
    public boolean B0;
    public final kf1 C0;
    public nf1 D0;
    public hw6 E;
    public final ArrayList E0;
    public tf1 F;
    public final zh6 F0;
    public TextView G;
    public if1 G0;
    public fv1 H;
    public int H0;
    public FrameLayout I;
    public ef1 I0;
    public f82 J;
    public wb2 J0;
    public LinearLayout K;
    public int K0;
    public ImageView L;
    public final vf1 L0;
    public xb M;
    public long M0;
    public dl1 N;
    public int N0;
    public s7 O;
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
    public jz1 X;
    public uf1 Y;
    public r47 Z;
    public final sz4 a;
    public TLRPC.ChannelParticipant a0;
    public final ll0 b;
    public FrameLayout b0;
    public final ll0 c;
    public ImageView c0;
    public final tq3 d;
    public ema d0;
    public final int e;
    public zc e0;
    public final TLRPC.Chat f;
    public jx f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final zh6 l0;
    public final zh6 m0;
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
    public gu w;
    public String w0;
    public UndoView x;
    public zh6 x0;
    public as y;
    public final pn y0;
    public final HashMap z0;

    public wf1(TLRPC.Chat chat) {
        super(null);
        int L;
        int L2;
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new zh6();
        this.m0 = new zh6();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new pn(R0);
        this.z0 = new HashMap();
        this.C0 = new kf1(this);
        this.E0 = new ArrayList();
        this.F0 = new zh6();
        this.H0 = Integer.MAX_VALUE;
        this.L0 = new vf1(this);
        this.N0 = -1;
        this.P0 = new RectF();
        vy4 vy4Var = this.glassEngine;
        vy4Var.a = new bf1(this);
        vy4Var.d = new gz4(hl.L(48.0f));
        ?? obj = new Object();
        this.a = obj;
        ll0 ll0Var = new ll0(obj, obj, obj);
        this.b = ll0Var;
        ll0Var.j = this.glassEngine;
        if (Build.VERSION.SDK_INT >= 31 && xea.f()) {
            tq3 tq3Var = new tq3(false);
            this.d = tq3Var;
            this.glassEngine.a(tq3Var);
            rz4 rz4Var = new rz4(obj);
            rz4Var.d = tq3Var;
            rz4Var.e = -3;
            rz4Var.f = obj;
            if (i86.e(262144)) {
                rz4 rz4Var2 = new rz4(obj);
                rz4Var2.d = tq3Var;
                rz4Var2.e = -2;
                rz4Var2.f = obj;
                ll0 ll0Var2 = new ll0(rz4Var2, rz4Var2, rz4Var2);
                this.c = ll0Var2;
                ll0Var2.j = this.glassEngine;
                if (i86.e(262144)) {
                    L2 = hl.L(8.0f);
                } else {
                    L2 = hl.L(48.0f);
                }
                ll0Var2.d = L2;
                ll0Var2.e = L2;
                ll0Var2.k = true;
                this.e = 0;
            } else {
                ll0 ll0Var3 = new ll0(rz4Var, rz4Var, rz4Var);
                this.c = ll0Var3;
                ll0Var3.j = this.glassEngine;
                if (i86.e(262144)) {
                    L = hl.L(8.0f);
                } else {
                    L = hl.L(48.0f);
                }
                ll0Var3.d = L;
                ll0Var3.e = L;
                this.e = hl.L(48.0f);
            }
        } else {
            this.d = null;
            this.e = 0;
            ll0 ll0Var4 = new ll0(obj, obj, obj);
            this.c = ll0Var4;
            ll0Var4.j = this.glassEngine;
        }
        this.f = chat;
    }

    public static gs8 P0(CharSequence charSequence) {
        wm2[] wm2VarArr;
        if (charSequence instanceof Spannable) {
            for (wm2 wm2Var : (wm2[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), wm2.class)) {
                if (wm2Var != null) {
                    Drawable drawable = wm2Var.c;
                    if (drawable instanceof gs8) {
                        return (gs8) drawable;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int b0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int c0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int d0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static void d1(int i, r47 r47Var) {
        if (r47Var == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = r47Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = r47Var.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            r47Var.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = ob6.G(i, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        r47Var.h5();
    }

    public static int e0(wf1 wf1Var) {
        return wf1Var.classGuid;
    }

    public static int f0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static CharSequence f1(SpannableStringBuilder spannableStringBuilder) {
        int t = hl.t(spannableStringBuilder, "\n\n");
        if (t >= 0 && Build.VERSION.SDK_INT >= 29) {
            vk1.j();
            spannableStringBuilder.setSpan(vk1.g(hl.L(8.0f)), t + 1, t + 2, 33);
        }
        return spannableStringBuilder;
    }

    public static int g0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int h0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int i0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int k0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int l0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int m0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int n0(wf1 wf1Var) {
        return wf1Var.currentAccount;
    }

    public static int o0(wf1 wf1Var) {
        return wf1Var.classGuid;
    }

    public static a w0(wf1 wf1Var) {
        return wf1Var.actionBar;
    }

    public static a x0(wf1 wf1Var) {
        return wf1Var.actionBar;
    }

    public static a y0(wf1 wf1Var) {
        return wf1Var.actionBar;
    }

    public final r47 I0(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        r47 r47Var;
        r47 r47Var2;
        String str;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            r47Var = null;
            if (i < arrayList2.size()) {
                r47Var2 = (r47) arrayList2.get(i);
                if (r47Var2 != null && r47Var2.U == 1 && r47Var2.J0 == j) {
                    break;
                }
                i++;
            } else {
                r47Var2 = null;
                break;
            }
        }
        if (r47Var2 == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((r47) arrayList.get(0)).k.date;
            } catch (Exception e) {
                cc4.g(e, true);
            }
            r47Var2 = new r47(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
        r47Var2.U = 1;
        if (z2 && arrayList.size() > 1) {
            r47Var2.J0 = j;
        } else {
            r47Var2.J0 = -1L;
        }
        String join = TextUtils.join(", ", Collection.EL.stream(arrayList).map(new yz((byte) 2)).distinct().map(new cf1(this, (byte) 0)).filter(new eh((byte) 2)).limit(4L).toArray());
        if (z2) {
            str = "EventLogDeletedMultipleMessagesToExpand";
        } else {
            str = "EventLogDeletedMultipleMessages";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r47.D5(ob6.G(arrayList.size(), str, join), "un1", X1));
        if (z2 && arrayList.size() > 1) {
            gs8 P0 = P0(r47Var2.v);
            int i2 = 2131751000;
            if (P0 == null) {
                if (z) {
                    i2 = 2131751001;
                }
                P0 = new gs8(ob6.M0(i2, null));
                Typeface o = hl.o();
                hn hnVar = P0.a;
                hnVar.x(o);
                hnVar.w(hl.L(10.0f));
                if (P0.c != -1) {
                    P0.c = -1;
                    P0.invalidateSelf();
                }
                P0.a(503316480);
            } else {
                hn hnVar2 = P0.a;
                if (z) {
                    i2 = 2131751001;
                }
                hnVar2.t(ob6.M0(i2, null), false, true);
            }
            P0.setBounds(0, 0, P0.getIntrinsicWidth(), hl.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new wm2(0, P0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        r47Var2.v = spannableStringBuilder;
        if (arrayList.size() > 0) {
            r47Var = (r47) c00.g(1, arrayList);
        }
        if (r47Var != null) {
            long j3 = r47Var.T;
            zh6 zh6Var = this.F0;
            if (!zh6Var.d(j3)) {
                long j4 = r47Var.T;
                int i3 = Q0;
                Q0 = i3 + 1;
                zh6Var.k(j4, Integer.valueOf(i3));
            }
            r47Var2.m1 = ((Integer) zh6Var.f(r47Var.T)).intValue();
        }
        return r47Var2;
    }

    public final void J0(android.os.Bundle r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf1.J0(android.os.Bundle, long):void");
    }

    public final void K0(r47 r47Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131689472, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        if (r47Var.D == 3) {
            idVar.U = ob6.M0(2131747909, null);
        } else {
            idVar.U = ob6.a0(null, null, 2131747936, r47Var.F0().mime_type);
        }
        showDialog(idVar);
    }

    public final void L0(boolean z) {
        int abs;
        as asVar = this.y;
        if (asVar != null && !this.j0) {
            int K0 = asVar.K0();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf1.M0(android.view.View, float, float):boolean");
    }

    public final TextureView N0(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            zc zcVar = new zc((byte) 7, getParentActivity(), this);
            this.e0 = zcVar;
            zcVar.setOutlineProvider(new yi((byte) 2));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            jx jxVar = new jx(getParentActivity());
            this.f0 = jxVar;
            jxVar.setBackgroundColor(0);
            if (z) {
                this.e0.addView(this.f0, tre.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, tre.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            uf1 uf1Var = this.Y;
            zc zcVar2 = this.e0;
            int i = hl.u;
            uf1Var.addView(zcVar2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void O0() {
        long j;
        r47 r47Var;
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
                r47 r47Var2 = (r47) arrayList4.get(i3);
                if (r47Var2 != null && (tL_channelAdminLogEvent2 = r47Var2.L1) != null && (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j = tL_channelAdminLogEvent2.user_id;
                } else {
                    j = 0;
                }
                if (r47Var2.m1 <= 0) {
                    int i4 = Q0;
                    Q0 = i4 + 1;
                    r47Var2.m1 = i4;
                }
                int i5 = i3 + 1;
                if (i5 < arrayList4.size()) {
                    r47Var = (r47) arrayList4.get(i5);
                } else {
                    r47Var = null;
                }
                if (r47Var != null && (tL_channelAdminLogEvent = r47Var.L1) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    j2 = tL_channelAdminLogEvent.user_id;
                } else {
                    j2 = 0;
                }
                if (j != 0) {
                    arrayList3.add(r47Var2);
                } else {
                    arrayList2.add(r47Var2);
                }
                if (j != j2 && !arrayList3.isEmpty()) {
                    TLRPC.ReplyMarkup replyMarkup = r47Var2.k.reply_markup;
                    if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((r47) arrayList3.get(size2)).U == 1; size2--) {
                        arrayList5.add((r47) arrayList3.remove(size2));
                    }
                    if (!arrayList3.isEmpty()) {
                        r47 r47Var3 = (r47) c00.g(1, arrayList3);
                        if (TextUtils.isEmpty(this.w0) && arrayList3.size() > 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Long valueOf = Long.valueOf(r47Var3.T);
                        HashSet hashSet = this.q0;
                        if (!hashSet.contains(valueOf) && z2) {
                            d1(arrayList3.size() - 1, r47Var3);
                            arrayList2.add(r47Var3);
                        } else {
                            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                d1(0, (r47) arrayList3.get(i6));
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        TLRPC.ReplyMarkup replyMarkup2 = r47Var3.k.reply_markup;
                        if ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z != z3) {
                            r47Var3.M1 = true;
                            tf1 tf1Var = this.F;
                            if (z) {
                                i = arrayList3.size() - 1;
                            } else {
                                i = 0;
                            }
                            tf1Var.g(i + size);
                            tf1 tf1Var2 = this.F;
                            if (z) {
                                i2 = arrayList3.size() - 1;
                            } else {
                                i2 = 0;
                            }
                            tf1Var2.g(size + i2 + 1);
                        }
                        long j3 = r47Var2.T;
                        arrayList = arrayList3;
                        arrayList2.add(I0(j3, r47Var2.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j3)), z2));
                    } else {
                        arrayList = arrayList3;
                    }
                    if (!arrayList5.isEmpty()) {
                        r47 r47Var4 = (r47) c00.g(1, arrayList5);
                        arrayList2.addAll(arrayList5);
                        arrayList2.add(I0(r47Var4.T, r47Var4.L1.user_id, arrayList5, true, false));
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
                    this.S.addListener(new jb1(this, (byte) 2));
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
        tq3 tq3Var;
        if (Build.VERSION.SDK_INT >= 31 && (tq3Var = this.d) != null) {
            if (vsd.a(i, 4)) {
                fz4 e = this.glassEngine.e();
                e.b(this.w.getY(), this.Y.getWidth(), this.w.getY() + this.w.getHeight());
                tq3Var.h(e);
            }
            uf1 uf1Var = this.Y;
            Objects.requireNonNull(uf1Var);
            tq3Var.e(new mr0(uf1Var, (byte) 2), this.Y.getWidth(), this.Y.getHeight());
        }
    }

    public final void S0(int r21, java.util.ArrayList r22, java.lang.Integer r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf1.S0(int, java.util.ArrayList, java.lang.Integer):void");
    }

    public final void T0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        int i;
        boolean z;
        boolean z2;
        ArrayList arrayList4 = arrayList;
        if (!arrayList4.isEmpty() && getParentActivity() != null) {
            int i2 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232580, 0, getResourceProvider(), getParentActivity());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(hl.L(200.0f));
            Rect rect = new Rect();
            getParentActivity().getResources().getDrawable(2131232580).mutate().getPadding(rect);
            yob.h(aob.G8, getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                if (arrayList4.get(i3) == null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(new k8(getParentActivity(), getResourceProvider()), tre.o(-1, 8));
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
                    b8 b8Var = new b8(0, getResourceProvider(), parentActivity, z, z2);
                    b8Var.setMinimumWidth(hl.L(200.0f));
                    b8Var.j((CharSequence) arrayList2.get(i3), ((Integer) arrayList3.get(i3)).intValue(), null);
                    if (((Integer) arrayList4.get(i3)).intValue() == 35) {
                        b8Var.d(getThemedColor(aob.q7), getThemedColor(aob.p7));
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                    b8Var.setOnClickListener(new jf(this, i3, arrayList4, (Integer) arrayList4.get(i3), (byte) 1));
                }
                i3++;
                arrayList4 = arrayList;
            }
            hf1 hf1Var = new hf1(this, this.Y.getContext(), (byte) 0);
            hf1Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            hf1Var.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
            if1 if1Var = new if1(this, hf1Var);
            this.G0 = if1Var;
            if1Var.e = true;
            if1Var.c = (short) 220;
            if1Var.setOutsideTouchable(true);
            this.G0.setClippingEnabled(true);
            this.G0.setAnimationStyle(2131755192);
            this.G0.setFocusable(true);
            hf1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
            this.G0.setInputMethodMode(2);
            this.G0.setSoftInputMode(48);
            this.G0.getContentView().setFocusableInTouchMode(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            int left = (((view.getLeft() + ((int) f)) - hf1Var.getMeasuredWidth()) + rect.left) - hl.L(28.0f);
            if (left < hl.L(6.0f)) {
                left = hl.L(6.0f);
            } else if (left > (this.w.getMeasuredWidth() - hl.L(6.0f)) - hf1Var.getMeasuredWidth()) {
                left = (this.w.getMeasuredWidth() - hl.L(6.0f)) - hf1Var.getMeasuredWidth();
            }
            if (hl.O1()) {
                int[] iArr = new int[2];
                this.fragmentView.getLocationInWindow(iArr);
                left += iArr[0];
            }
            int height = this.Y.getHeight();
            int L = hl.L(48.0f) + hf1Var.getMeasuredHeight();
            int Q = this.Y.Q();
            if (Q > hl.L(20.0f)) {
                height += Q;
            }
            if (L < height) {
                i = (int) (this.w.getY() + view.getTop() + f2);
                if ((L - rect.top) - rect.bottom > hl.L(240.0f)) {
                    i += hl.L(240.0f) - L;
                }
                if (i < this.w.getY() + hl.L(24.0f)) {
                    i = (int) (this.w.getY() + hl.L(24.0f));
                } else {
                    int i4 = height - L;
                    if (i > i4 - hl.L(8.0f)) {
                        i = i4 - hl.L(8.0f);
                    }
                }
            } else {
                if (!this.inBubbleMode) {
                    i2 = hl.m;
                }
                i = i2;
            }
            hf1Var.setMaxHeight(height - i);
            this.G0.showAtLocation(this.w, 51, left, i);
            this.G0.b();
        }
    }

    public final void U0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().j4(tL_channels_channelParticipants.users, false);
            getMessagesController().c4(tL_channels_channelParticipants.chats, false);
            this.u0 = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.f;
            if (chat != null && (N0 = getMessagesController().N0(chat.id)) != null && N0.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant();
                channelParticipant.user_id = getMessagesController().L3;
                channelParticipant.peer = getMessagesController().y1(channelParticipant.user_id);
                long j = getMessagesController().L3;
                if (getMessagesController().X1(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new af1(this, (byte) 1));
                }
                this.u0.add(0, channelParticipant);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof jb) {
                ((jb) dialog).a1(this.u0);
            }
        }
    }

    public final void V0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        r47 r47Var;
        int i = 0;
        this.D0.N = false;
        a1(false);
        uc7.s1(this.currentAccount).j4(tL_channels_adminLogResults.users, false);
        uc7.s1(this.currentAccount).c4(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = this.o0;
        boolean z = false;
        for (int i2 = 0; i2 < tL_channels_adminLogResults.events.size(); i2++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            long j = tL_channelAdminLogEvent.id;
            zh6 zh6Var = this.l0;
            if (zh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent.id);
                r47 r47Var2 = new r47(this.currentAccount, tL_channelAdminLogEvent, arrayList, this.n0, this.f, this.U, false);
                if (r47Var2.U >= 0) {
                    zh6Var.k(tL_channelAdminLogEvent.id, r47Var2);
                }
                z = true;
            }
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            r47 r47Var3 = (r47) arrayList.get(size);
            if (r47Var3 != null && r47Var3.U != 0 && r47Var3.L1() >= 0) {
                this.m0.k(r47Var3.L1(), r47Var3);
            }
            if (r47Var3 != null && (message = r47Var3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (size != i3) {
                                r47Var = (r47) arrayList.get(i3);
                                if (r47Var.U != 1 && r47Var.L1() == messageReplyHeader.reply_to_msg_id) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            r47Var = null;
                            break;
                        }
                    }
                    if (r47Var != null) {
                        r47Var3.C = r47Var;
                    }
                }
                arrayList2.add(r47Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            ls6.d0(this.currentAccount).Y0(arrayList2, -this.f.id, 0, 0L, new ef1(this, (byte) 1), getClassGuid(), null);
        }
        O0();
        this.s0 = false;
        if (!z) {
            this.r0 = true;
        }
        hl.T3(this.n, false, 0.3f, true, true);
        this.w.setEmptyView(this.I);
        tf1 tf1Var = this.F;
        if (tf1Var != null) {
            tf1Var.f();
        }
        s7 s7Var = this.O;
        if (s7Var != null) {
            if (this.p0.isEmpty() && TextUtils.isEmpty(this.w0)) {
                i = 8;
            }
            s7Var.setVisibility(i);
        }
    }

    public final void W0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.t0 = false;
        this.D0.N = false;
        a1(false);
        uc7.s1(this.currentAccount).j4(tL_channels_adminLogResults.users, false);
        uc7.s1(this.currentAccount).c4(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            zh6 zh6Var = this.l0;
            if (zh6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent2.id);
                r47 r47Var = new r47(this.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, this.f, this.U, false);
                if (r47Var.U >= 0 && (((tL_channelAdminLogEvent = r47Var.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !zh6Var.d(tL_channelAdminLogEvent2.id))) {
                    this.o0.add(0, r47Var);
                    zh6Var.k(tL_channelAdminLogEvent2.id, r47Var);
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
        tf1 tf1Var;
        if (!this.s0) {
            ArrayList arrayList = this.o0;
            if (z) {
                this.P = Long.MAX_VALUE;
                FrameLayout frameLayout = this.n;
                if (frameLayout != null) {
                    hl.T3(frameLayout, true, 0.3f, true, true);
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
            tL_channels_getAdminLog.channel = uc7.i1(this.f);
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
                    tL_channels_getAdminLog.admins.add(uc7.s1(this.currentAccount).q1((TLRPC.User) this.x0.n(i)));
                }
            }
            g1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new af1(this, (byte) 3));
            if (z && (tf1Var = this.F) != null) {
                tf1Var.f();
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
        tL_channels_getAdminLog.channel = uc7.i1(this.f);
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
                tL_channels_getAdminLog.admins.add(uc7.s1(this.currentAccount).q1((TLRPC.User) this.x0.n(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new af1(this, (byte) 0));
    }

    public final void a1(boolean z) {
        int i;
        long j;
        gu guVar = this.w;
        if (guVar != null && this.y != null && guVar.getChildCount() > 0) {
            if (z) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
            wb2 wb2Var = null;
            int i2 = -1;
            for (int i3 = 0; i3 < this.w.getChildCount(); i3++) {
                View childAt = this.w.getChildAt(i3);
                this.w.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    int top = childAt.getTop();
                    if (z) {
                        if (top >= i) {
                        }
                        i = childAt.getTop();
                        wb2Var = childAt;
                        i2 = S;
                    } else {
                        if (top <= i) {
                        }
                        i = childAt.getTop();
                        wb2Var = childAt;
                        i2 = S;
                    }
                }
            }
            if (wb2Var != null) {
                if (wb2Var instanceof wb2) {
                    j = wb2Var.getMessageObject().T;
                } else if (wb2Var instanceof dl1) {
                    j = wb2Var.getMessageObject().T;
                } else {
                    j = 0;
                }
                this.M0 = j;
                this.N0 = i2;
                this.O0 = (this.w.getMeasuredHeight() - wb2Var.getBottom()) - this.w.getPaddingBottom();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.wf));
        hashSet.add(Integer.valueOf(aob.vf));
        hashSet.add(Integer.valueOf(aob.Gc));
        hashSet.add(Integer.valueOf(aob.hf));
        hashSet.add(Integer.valueOf(aob.Ic));
        hashSet.add(Integer.valueOf(aob.Hc));
        hashSet.add(Integer.valueOf(aob.kf));
        hashSet.add(Integer.valueOf(aob.jf));
        hashSet.add(Integer.valueOf(aob.md));
        hashSet.add(Integer.valueOf(aob.af));
        hashSet.add(Integer.valueOf(aob.ld));
        hashSet.add(Integer.valueOf(aob.Ze));
        hashSet.add(Integer.valueOf(aob.Hb));
        hashSet.add(Integer.valueOf(aob.Fc));
        hashSet.add(Integer.valueOf(aob.Gb));
        hashSet.add(Integer.valueOf(aob.Ec));
        hashSet.add(Integer.valueOf(aob.Rb));
        hashSet.add(Integer.valueOf(aob.Ld));
        hashSet.add(Integer.valueOf(aob.Be));
        hashSet.add(Integer.valueOf(aob.Cc));
        hashSet.add(Integer.valueOf(aob.Ae));
        hashSet.add(Integer.valueOf(aob.Bc));
        hashSet.add(Integer.valueOf(aob.ze));
        hashSet.add(Integer.valueOf(aob.Ac));
        hashSet.add(Integer.valueOf(aob.ye));
        hashSet.add(Integer.valueOf(aob.zc));
        hashSet.add(Integer.valueOf(aob.xe));
        hashSet.add(Integer.valueOf(aob.yc));
        hashSet.add(Integer.valueOf(aob.we));
        hashSet.add(Integer.valueOf(aob.xc));
        hashSet.add(Integer.valueOf(aob.ve));
        hashSet.add(Integer.valueOf(aob.wc));
        hashSet.add(Integer.valueOf(aob.ue));
        hashSet.add(Integer.valueOf(aob.vc));
        hashSet.add(Integer.valueOf(aob.te));
        hashSet.add(Integer.valueOf(aob.uc));
        hashSet.add(Integer.valueOf(aob.se));
        hashSet.add(Integer.valueOf(aob.tc));
        hashSet.add(Integer.valueOf(aob.re));
        hashSet.add(Integer.valueOf(aob.sc));
        hashSet.add(Integer.valueOf(aob.qe));
        hashSet.add(Integer.valueOf(aob.rc));
        hashSet.add(Integer.valueOf(aob.pe));
        hashSet.add(Integer.valueOf(aob.qc));
        hashSet.add(Integer.valueOf(aob.me));
        hashSet.add(Integer.valueOf(aob.oe));
        hashSet.add(Integer.valueOf(aob.ne));
        hashSet.add(Integer.valueOf(aob.le));
        hashSet.add(Integer.valueOf(aob.mc));
        hashSet.add(Integer.valueOf(aob.ke));
        hashSet.add(Integer.valueOf(aob.lc));
        hashSet.add(Integer.valueOf(aob.je));
        hashSet.add(Integer.valueOf(aob.kc));
        hashSet.add(Integer.valueOf(aob.ie));
        hashSet.add(Integer.valueOf(aob.cc));
        hashSet.add(Integer.valueOf(aob.ge));
        hashSet.add(Integer.valueOf(aob.ec));
        hashSet.add(Integer.valueOf(aob.fe));
        hashSet.add(Integer.valueOf(aob.jc));
        hashSet.add(Integer.valueOf(aob.ee));
        hashSet.add(Integer.valueOf(aob.be));
        hashSet.add(Integer.valueOf(aob.ic));
        hashSet.add(Integer.valueOf(aob.ae));
        hashSet.add(Integer.valueOf(aob.hc));
        hashSet.add(Integer.valueOf(aob.Zd));
        hashSet.add(Integer.valueOf(aob.Yd));
        hashSet.add(Integer.valueOf(aob.Yb));
        hashSet.add(Integer.valueOf(aob.Ud));
        hashSet.add(Integer.valueOf(aob.Xb));
        hashSet.add(Integer.valueOf(aob.Td));
        hashSet.add(Integer.valueOf(aob.Sd));
        hashSet.add(Integer.valueOf(aob.Wb));
        hashSet.add(Integer.valueOf(aob.Rd));
        hashSet.add(Integer.valueOf(aob.Vb));
        hashSet.add(Integer.valueOf(aob.Qd));
        hashSet.add(Integer.valueOf(aob.Ub));
        hashSet.add(Integer.valueOf(aob.Pd));
        hashSet.add(Integer.valueOf(aob.Od));
        hashSet.add(Integer.valueOf(aob.Md));
        hashSet.add(Integer.valueOf(aob.Id));
        hashSet.add(Integer.valueOf(aob.Qb));
        hashSet.add(Integer.valueOf(aob.Hd));
        hashSet.add(Integer.valueOf(aob.Pb));
        hashSet.add(Integer.valueOf(aob.Fd));
        hashSet.add(Integer.valueOf(aob.Ed));
        hashSet.add(Integer.valueOf(aob.Dd));
        hashSet.add(Integer.valueOf(aob.Cd));
        hashSet.add(Integer.valueOf(aob.Ob));
        hashSet.add(Integer.valueOf(aob.Bd));
        hashSet.add(Integer.valueOf(aob.Ad));
        hashSet.add(Integer.valueOf(aob.zd));
        hashSet.add(Integer.valueOf(aob.xd));
        hashSet.add(Integer.valueOf(aob.wd));
        hashSet.add(Integer.valueOf(aob.qa));
        hashSet.add(Integer.valueOf(aob.r7));
        hashSet.add(Integer.valueOf(aob.zb));
        hashSet.add(Integer.valueOf(aob.vd));
        hashSet.add(Integer.valueOf(aob.ud));
        hashSet.add(Integer.valueOf(aob.Nb));
        hashSet.add(Integer.valueOf(aob.Mb));
        hashSet.add(Integer.valueOf(aob.td));
        hashSet.add(Integer.valueOf(aob.sd));
        hashSet.add(Integer.valueOf(aob.rd));
        hashSet.add(Integer.valueOf(aob.Lb));
        hashSet.add(Integer.valueOf(aob.Kb));
        hashSet.add(Integer.valueOf(aob.qd));
        hashSet.add(Integer.valueOf(aob.pd));
        hashSet.add(Integer.valueOf(aob.od));
        hashSet.add(Integer.valueOf(aob.Jb));
        hashSet.add(Integer.valueOf(aob.Ib));
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.Yc));
        hashSet.add(Integer.valueOf(aob.Xc));
        hashSet.add(Integer.valueOf(aob.Wc));
        hashSet.add(Integer.valueOf(aob.Vc));
        hashSet.add(Integer.valueOf(aob.dd));
        hashSet.add(Integer.valueOf(aob.cd));
        hashSet.add(Integer.valueOf(aob.bd));
        hashSet.add(Integer.valueOf(aob.ad));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.wb));
        hashSet.add(Integer.valueOf(aob.vb));
        hashSet.add(Integer.valueOf(aob.ub));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.tb));
        hashSet.add(Integer.valueOf(aob.ta));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.o8));
        hashSet.add(Integer.valueOf(aob.n8));
        hashSet.add(Integer.valueOf(aob.m8));
        hashSet.add(Integer.valueOf(aob.l8));
        hashSet.add(Integer.valueOf(aob.k8));
        hashSet.add(Integer.valueOf(aob.j8));
        hashSet.add(Integer.valueOf(aob.i8));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.B8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final int b1(r47 r47Var) {
        wb2 wb2Var = this.J0;
        if (wb2Var != null) {
            wb2Var.td = 0;
            wb2Var.ud = null;
        }
        return 0;
    }

    public final void c1(defpackage.r47 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf1.c1(r47):void");
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new wb2(context, this.currentAccount));
            }
        }
        this.V = false;
        this.hasOwnBackground = true;
        aob.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!hl.O1());
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 20));
        f82 f82Var = new f82(context, null, false, null);
        this.J = f82Var;
        ns1 ns1Var = f82Var.h;
        if (ns1Var != null) {
            ns1Var.setTextSizePx(hl.L(17.5f));
        }
        ns1 ns1Var2 = f82Var.r;
        if (ns1Var2 != null) {
            ns1Var2.setTextSizePx(hl.L(13.5f));
        }
        f82Var.m0 = true;
        this.J.setOccupyStatusBar(!hl.O1());
        this.actionBar.addView(this.J, 0, tre.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        s7 a = this.actionBar.u().a(0, 2131232502);
        a.N();
        a.I = new r10(this, (byte) 1);
        this.O = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        f82 f82Var2 = this.J;
        TLRPC.Chat chat = this.f;
        f82Var2.setTitle(chat.title);
        this.J.setSubtitle(ob6.M0(2131751039, null));
        this.J.setChatAvatar(chat);
        mf1 mf1Var = new mf1(this, context);
        this.fragmentView = mf1Var;
        this.Y = mf1Var;
        mf1Var.setOccupyStatusBar(!hl.O1());
        this.Y.U(aob.r0());
        a aVar = this.actionBar;
        ql0 o = dtd.o(this.resourceProvider);
        ll0 ll0Var = this.c;
        aVar.P(ll0Var, o, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, tre.e(-1, -2, 17));
        this.I.setOnTouchListener(new q8((byte) 24));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new pnb(this.M, this.Y, hl.L(12.0f), aob.f2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(2131231615);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, tre.t(54, 54, 17, 16, 20, 16, -4));
        xb xbVar = new xb(context, (byte) 14);
        this.M = xbVar;
        xbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        xb xbVar2 = this.M;
        int i2 = aob.Zc;
        yob.X(xbVar2, i2, null);
        this.M.setPadding(hl.L(8.0f), hl.L(5.0f), hl.L(8.0f), hl.L(5.0f));
        this.K.addView(this.M, tre.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, tre.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        gu guVar = new gu((byte) 5, context, this);
        this.w = guVar;
        guVar.setOnItemClickListener(new ri6(this, (byte) 15));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        gu guVar2 = this.w;
        tf1 tf1Var = new tf1(this, context);
        this.F = tf1Var;
        guVar2.setAdapter(tf1Var);
        this.w.setClipToPadding(false);
        gu guVar3 = this.w;
        int i3 = hl.m;
        int i4 = this.e;
        guVar3.setPadding(0, hl.L(4.0f) + a.getCurrentActionBarHeight() + i3 + i4, 0, hl.L(60.0f) + i4 + hl.n);
        gu guVar4 = this.w;
        nf1 nf1Var = new nf1(this, this.w, this.resourceProvider);
        this.D0 = nf1Var;
        guVar4.setItemAnimator(nf1Var);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        as asVar = new as(this);
        this.y = asVar;
        asVar.i1(1);
        this.y.k1(true);
        this.w.setLayoutManager(this.y);
        hw6 hw6Var = new hw6(this.w, this.y);
        this.E = hw6Var;
        hw6Var.n = new bf1(this);
        hw6Var.r = this.L0;
        this.Y.addView(this.w, tre.c(-1.0f, -1));
        this.w.setOnScrollListener(new y(this));
        this.glassEngine.b(this.w);
        int i5 = this.h0;
        if (i5 != -1) {
            this.y.g1(i5, this.i0);
            this.h0 = -1;
        }
        jz1 jz1Var = new jz1(context);
        this.X = jz1Var;
        jz1Var.setup(this.b);
        this.X.setFadeZoneTop(hl.L(2.0f) + a.getCurrentActionBarHeight() + hl.m);
        this.X.setFadeHeightTop(hl.L(60.0f));
        this.X.setFadeZoneBottom(hl.L(7.0f) + hl.L(44.0f) + hl.L(9.0f) + hl.n);
        this.X.setFadeHeightBottom(hl.L(60.0f));
        this.Y.addView(this.X, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, tre.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new pnb(this.r, this.Y, hl.L(18.0f), aob.f2));
        this.n.addView(this.r, tre.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(hl.L(28.0f));
        this.s.setProgressColor(aob.w0(null, i2, false));
        this.n.addView(this.s, tre.e(32, 32, 17));
        dl1 dl1Var = new dl1(context);
        this.N = dl1Var;
        dl1Var.setAlpha(0.0f);
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, tre.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        vnb vnbVar = this.resourceProvider;
        fv1 fv1Var = new fv1(context, vnbVar, dtd.b(vnbVar), ll0Var);
        this.H = fv1Var;
        fv1Var.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-hl.n);
        this.H.c(4, true, false);
        fv1 fv1Var2 = this.H;
        jl0 c = fv1Var2.n.c(fv1Var2, null, false);
        c.p(fv1Var2.r);
        ik8.r(c, hl.L(22.0f), 6.0f);
        fv1Var2.w = c;
        this.Y.addView(this.H, tre.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final wf1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                wf1 wf1Var = this.b;
                switch (b) {
                    case 0:
                        if (wf1Var.getParentActivity() != null) {
                            jb jbVar = new jb(wf1Var, wf1Var.v0, wf1Var.x0, wf1Var.f.megagroup);
                            jbVar.a1(wf1Var.u0);
                            jbVar.b2 = new bf1(wf1Var);
                            wf1Var.showDialog(jbVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        boolean z = wf1Var.f.megagroup;
                        id idVar = alertDialog$Builder.a;
                        if (z) {
                            idVar.U = hl.S2(ob6.M0(2131750942, null));
                        } else {
                            idVar.U = hl.S2(ob6.M0(2131750941, null));
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.S = ob6.M0(2131750940, null);
                        wf1Var.showDialog(idVar);
                        return;
                    default:
                        if (wf1Var.getParentActivity() != null) {
                            hl.t1(wf1Var.O.getSearchField());
                            wf1Var.showDialog((nx0) jj.o(wf1Var.getParentActivity(), new ze1(wf1Var, (byte) 0), null).b);
                            return;
                        }
                        return;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(hl.o());
        yob.X(this.G, aob.sf, null);
        this.G.setText(ob6.M0(2131745711, null));
        this.G.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        this.H.getContainer().addView(this.G, tre.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) {
            public final wf1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                wf1 wf1Var = this.b;
                switch (b) {
                    case 0:
                        if (wf1Var.getParentActivity() != null) {
                            jb jbVar = new jb(wf1Var, wf1Var.v0, wf1Var.x0, wf1Var.f.megagroup);
                            jbVar.a1(wf1Var.u0);
                            jbVar.b2 = new bf1(wf1Var);
                            wf1Var.showDialog(jbVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        boolean z = wf1Var.f.megagroup;
                        id idVar = alertDialog$Builder.a;
                        if (z) {
                            idVar.U = hl.S2(ob6.M0(2131750942, null));
                        } else {
                            idVar.U = hl.S2(ob6.M0(2131750941, null));
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.S = ob6.M0(2131750940, null);
                        wf1Var.showDialog(idVar);
                        return;
                    default:
                        if (wf1Var.getParentActivity() != null) {
                            hl.t1(wf1Var.O.getSearchField());
                            wf1Var.showDialog((nx0) jj.o(wf1Var.getParentActivity(), new ze1(wf1Var, (byte) 0), null).b);
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
        this.b0.setPadding(0, hl.L(3.0f), 0, 0);
        this.Y.addView(this.b0, tre.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(2131232081);
        yob.s(this.c0, aob.pf, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, tre.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) {
            public final wf1 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                wf1 wf1Var = this.b;
                switch (b) {
                    case 0:
                        if (wf1Var.getParentActivity() != null) {
                            jb jbVar = new jb(wf1Var, wf1Var.v0, wf1Var.x0, wf1Var.f.megagroup);
                            jbVar.a1(wf1Var.u0);
                            jbVar.b2 = new bf1(wf1Var);
                            wf1Var.showDialog(jbVar);
                            return;
                        }
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        boolean z = wf1Var.f.megagroup;
                        id idVar = alertDialog$Builder.a;
                        if (z) {
                            idVar.U = hl.S2(ob6.M0(2131750942, null));
                        } else {
                            idVar.U = hl.S2(ob6.M0(2131750941, null));
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.S = ob6.M0(2131750940, null);
                        wf1Var.showDialog(idVar);
                        return;
                    default:
                        if (wf1Var.getParentActivity() != null) {
                            hl.t1(wf1Var.O.getSearchField());
                            wf1Var.showDialog((nx0) jj.o(wf1Var.getParentActivity(), new ze1(wf1Var, (byte) 0), null).b);
                            return;
                        }
                        return;
                }
            }
        });
        ema emaVar = new ema(context);
        this.d0 = emaVar;
        yob.W(emaVar, aob.qf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(hl.o());
        this.b0.addView(this.d0, tre.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            hl.T3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            hl.T3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        gu guVar5 = this.w;
        guVar5.X1 = true;
        guVar5.Y1 = true;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(hl.L(51.0f));
        this.Y.addView(this.x, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        g1();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wb2 wb2Var;
        r47 messageObject;
        wb2 wb2Var2;
        r47 messageObject2;
        wb2 wb2Var3;
        r47 messageObject3;
        boolean z;
        if (i == jn7.l4) {
            gu guVar = this.w;
            if (guVar != null) {
                guVar.i1();
                return;
            }
            return;
        }
        if (i == jn7.h2) {
            if (((r47) objArr[0]).g4()) {
                MediaController.z().s0(N0(true), this.f0, this.e0, true);
                int childCount = this.w.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        View childAt = this.w.getChildAt(i3);
                        if (childAt instanceof wb2) {
                            wb2 wb2Var4 = (wb2) childAt;
                            r47 messageObject4 = wb2Var4.getMessageObject();
                            if (this.e0 != null && messageObject4.g4() && MediaController.z().H(messageObject4)) {
                                ImageReceiver photoImage = wb2Var4.getPhotoImage();
                                this.e0.setTranslationX(photoImage.L0);
                                this.e0.setTranslationY(wb2Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
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
                    r47 r47Var = MediaController.z().v0;
                    if (!z) {
                        this.e0.setTranslationY((-hl.u) - 100);
                        this.fragmentView.invalidate();
                        if (r47Var != null && r47Var.g4() && (this.W || MediaController.z().I0 != null)) {
                            MediaController.z().m0(false);
                        }
                    } else {
                        MediaController.z().m0(true);
                    }
                }
            }
            gu guVar2 = this.w;
            if (guVar2 != null) {
                int childCount2 = guVar2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.w.getChildAt(i4);
                    if ((childAt2 instanceof wb2) && (messageObject3 = (wb2Var3 = (wb2) childAt2).getMessageObject()) != null) {
                        if (!r47.Q4(messageObject3.k) && !messageObject3.I3()) {
                            if (messageObject3.g4()) {
                                wb2Var3.o0(null, false);
                                if (!MediaController.z().H(messageObject3) && messageObject3.b0 != 0.0f) {
                                    messageObject3.F5();
                                    wb2Var3.invalidate();
                                }
                            }
                        } else {
                            wb2Var3.R3(false, true, false);
                        }
                    }
                }
            }
        } else if (i != jn7.f2 && i != jn7.g2) {
            if (i == jn7.e2) {
                Integer num = (Integer) objArr[0];
                gu guVar3 = this.w;
                if (guVar3 != null) {
                    int childCount3 = guVar3.getChildCount();
                    for (int i5 = 0; i5 < childCount3; i5++) {
                        View childAt3 = this.w.getChildAt(i5);
                        if ((childAt3 instanceof wb2) && (messageObject2 = (wb2Var2 = (wb2) childAt3).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                            r47 r47Var2 = MediaController.z().v0;
                            if (r47Var2 != null) {
                                messageObject2.b0 = r47Var2.b0;
                                messageObject2.i0 = r47Var2.i0;
                                messageObject2.j0 = r47Var2.j0;
                                wb2Var2.W3();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (i == jn7.C4 && this.fragmentView != null) {
                this.Y.U(aob.r0());
                this.r.invalidate();
                xb xbVar = this.M;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                this.w.i1();
            }
        } else {
            gu guVar4 = this.w;
            if (guVar4 != null) {
                int childCount4 = guVar4.getChildCount();
                for (int i6 = 0; i6 < childCount4; i6++) {
                    View childAt4 = this.w.getChildAt(i6);
                    if ((childAt4 instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt4).getMessageObject()) != null) {
                        if (!r47.Q4(messageObject.k) && !messageObject.I3()) {
                            if (messageObject.g4() && !MediaController.z().H(messageObject)) {
                                wb2Var.o0(null, true);
                            }
                        } else {
                            wb2Var.R3(false, true, false);
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
        uc7 messagesController = getMessagesController();
        TLRPC.Chat chat = this.f;
        TLRPC.ChatFull N0 = messagesController.N0(chat.id);
        bt5 bt5Var = new bt5(this.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, N0, hashMap, this, N0.id, false, xc2.T(chat));
        bt5Var.d2 = new lf1(this);
        bt5Var.show();
    }

    public final void g1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(hl.L(8.0f), hl.L(3.0f), hl.L(8.0f), hl.L(3.0f));
            this.M.setText(hl.S2(ob6.M0(2131747932, null)));
        } else if (this.x0 == null && this.v0 == null) {
            this.L.setVisibility(0);
            this.M.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
            boolean z = this.f.megagroup;
            xb xbVar = this.M;
            if (z) {
                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131750977, null));
                f1(S2);
                xbVar.setText(S2);
                return;
            }
            SpannableStringBuilder S22 = hl.S2(ob6.M0(2131750976, null));
            f1(S22);
            xbVar.setText(S22);
        } else {
            this.L.setVisibility(8);
            this.M.setPadding(hl.L(8.0f), hl.L(3.0f), hl.L(8.0f), hl.L(3.0f));
            this.M.setText(hl.S2(ob6.M0(2131747931, null)));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ee));
        arrayList.add(new apb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        arrayList.add(new apb(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.A8));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Sb));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Vd));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Zb));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Wd));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ac));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.nc));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.pc));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.oc));
        arrayList.add(new apb(this.w, 0, new Class[]{wb2.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.gf));
        arrayList.add(new apb(this.w, 131072, new Class[]{bf2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (zob) null, aob.xf));
        View view = this.r;
        int i = aob.cd;
        arrayList.add(new apb(view, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.M, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    public final void h1() {
        dl1 dl1Var;
        r47 messageObject;
        int i;
        gu guVar = this.w;
        if (guVar == null) {
            return;
        }
        int childCount = guVar.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i2 = Integer.MAX_VALUE;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        boolean z2 = false;
        wb2 wb2Var = null;
        View view = null;
        View view2 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.w.getChildAt(i4);
            if (childAt instanceof ec2) {
                ec2 ec2Var = (ec2) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                ec2Var.f = y;
                ec2Var.h = backgroundSizeY;
            } else if (childAt instanceof wb2) {
                wb2 wb2Var2 = (wb2) childAt;
                int top = wb2Var2.getTop();
                wb2Var2.getBottom();
                if (top >= 0) {
                    i = 0;
                } else {
                    i = -top;
                }
                int measuredHeight2 = wb2Var2.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i + measuredHeight;
                }
                wb2Var2.D3(i, measuredHeight2 - i, (this.Y.getHeightWithKeyboard() - hl.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                r47 messageObject2 = wb2Var2.getMessageObject();
                if (this.e0 != null && messageObject2.g4() && MediaController.z().H(messageObject2)) {
                    ImageReceiver photoImage = wb2Var2.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof dl1) {
                dl1 dl1Var2 = (dl1) childAt;
                dl1Var2.j0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (dl1Var2.S()) {
                    dl1Var2.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i2) {
                    if ((childAt instanceof wb2) || (childAt instanceof dl1)) {
                        wb2Var = childAt;
                    }
                    i2 = bottom;
                    view2 = childAt;
                }
                nf1 nf1Var = this.D0;
                if ((nf1Var == null || (!nf1Var.Z(childAt) && !this.D0.Y(childAt))) && (childAt instanceof dl1) && ((dl1) childAt).getMessageObject().l0) {
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
        zc zcVar = this.e0;
        if (zcVar != null) {
            if (!z2) {
                zcVar.setTranslationY((-hl.u) - 100);
                this.fragmentView.invalidate();
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.g4() && this.W) {
                    MediaController.z().m0(false);
                }
            } else {
                MediaController.z().m0(true);
            }
        }
        if (wb2Var != null) {
            if (wb2Var instanceof wb2) {
                messageObject = wb2Var.getMessageObject();
            } else {
                messageObject = ((dl1) wb2Var).getMessageObject();
            }
            this.N.h0(messageObject.k.date, false, true);
        }
        this.Q = false;
        if (!(view2 instanceof wb2) && !(view2 instanceof dl1)) {
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
                this.N.setTranslationY(((-dl1Var.getMeasuredHeight()) << 1) + bottom2);
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
        gu guVar = this.w;
        if (guVar != null) {
            int childCount = guVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.w.getChildAt(i);
                boolean z2 = true;
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    r47 messageObject = wb2Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.z()) {
                            wb2Var.setDrawSelectionBackground(false);
                            wb2Var.m3(false, true);
                            wb2Var.o3(false, false, true);
                        }
                        if (this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wb2Var.setHighlighted(z);
                        if (this.H0 != Integer.MAX_VALUE) {
                            ef1 ef1Var = this.I0;
                            if (ef1Var != null) {
                                hl.r(ef1Var);
                            }
                            ef1 ef1Var2 = new ef1(this, (byte) 0);
                            this.I0 = ef1Var2;
                            hl.d3(ef1Var2, 1000L);
                        }
                        if (!TextUtils.isEmpty(this.w0)) {
                            wb2Var.v3(this.w0);
                        } else {
                            wb2Var.v3(null);
                        }
                        if (this.w.getScrollState() == 0) {
                            z2 = false;
                        }
                        wb2Var.setSpoilersSuppressed(z2);
                    }
                } else if (childAt instanceof dl1) {
                    dl1 dl1Var = (dl1) childAt;
                    dl1Var.setMessageObject(dl1Var.getMessageObject());
                    if (this.w.getScrollState() == 0) {
                        z2 = false;
                    }
                    dl1Var.setSpoilersSuppressed(z2);
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
        jn7.e().b(this, jn7.l4);
        jn7.f(this.currentAccount).b(this, jn7.h2);
        jn7.f(this.currentAccount).b(this, jn7.g2);
        jn7.f(this.currentAccount).b(this, jn7.f2);
        jn7.f(this.currentAccount).b(this, jn7.e2);
        jn7.e().b(this, jn7.C4);
        X0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = uc7.i1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new af1(this, (byte) 4)), this.classGuid);
        setBulletinDelegate(new py((byte) 4));
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.l4);
        jn7.f(this.currentAccount).n(this, jn7.h2);
        jn7.f(this.currentAccount).n(this, jn7.g2);
        jn7.f(this.currentAccount).n(this, jn7.f2);
        jn7.f(this.currentAccount).n(this, jn7.e2);
        jn7.e().n(this, jn7.C4);
        this.y0.e();
    }

    @Override
    public final void onPause() {
        super.onPause();
        uf1 uf1Var = this.Y;
        if (uf1Var != null) {
            pvc pvcVar = uf1Var.w;
            if (pvcVar != null) {
                pvcVar.b(false);
            }
            uf1Var.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        vh4 vh4Var = vh4.f;
        if (vh4Var != null && vh4Var.a) {
            vh4 r = vh4.r();
            if (r.a) {
                int i = dc0.G;
                ((tb0) r.d).b(false);
            }
        }
    }

    @Override
    public final void onRemoveFromParent() {
        MediaController.z().s0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        uf1 uf1Var = this.Y;
        if (uf1Var != null) {
            pvc pvcVar = uf1Var.w;
            if (pvcVar != null) {
                pvcVar.b(true);
            }
            uf1Var.G = false;
        }
        this.j0 = false;
        L0(false);
        if (this.k0) {
            this.k0 = false;
            tf1 tf1Var = this.F;
            if (tf1Var != null) {
                tf1Var.f();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(aob.w0(null, aob.Zc, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
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
