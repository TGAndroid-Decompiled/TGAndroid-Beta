package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class n0c extends FrameLayout implements fn7 {
    public static final int r0 = 0;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public int I;
    public int J;
    public ValueAnimator K;
    public long L;
    public String M;
    public final ArrayList N;
    public int O;
    public c0c P;
    public pyb Q;
    public boolean R;
    public final qob S;
    public final ox0 T;
    public final ArrayList U;
    public long V;
    public Boolean W;
    public final int a;
    public float a0;
    public final long b;
    public ValueAnimator b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public float d0;
    public final vnb e;
    public float e0;
    public final cs1 f;
    public boolean f0;
    public boolean g0;
    public final ir8 h;
    public float h0;
    public VelocityTracker i0;
    public boolean j0;
    public ValueAnimator k0;
    public final TextPaint l0;
    public final HashMap m0;
    public final ImageView n;
    public final TextPaint n0;
    public final TextPaint o0;
    public final TextPaint p0;
    public final TextPaint q0;
    public final d79 r;
    public final i0c s;
    public final EditText w;
    public final Paint x;
    public float y;

    public n0c(Activity activity, int i, long j, vnb vnbVar, final cs1 cs1Var) {
        super(activity);
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        String str;
        String M0;
        TLRPC.Chat chat;
        TLRPC.User user;
        this.x = new Paint();
        this.H = -1;
        this.J = hl.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.U = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.l0 = textPaint;
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        this.m0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.n0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.o0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.p0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.q0 = textPaint5;
        textPaint2.setTextSize(hl.L(16.0f));
        textPaint2.setTypeface(hl.o());
        textPaint3.setTextSize(hl.L(13.0f));
        textPaint4.setTextSize(hl.L(15.0f));
        uh9.p(textPaint5, hl.L(12.0f));
        this.a = i;
        this.b = j;
        this.e = vnbVar;
        this.f = cs1Var;
        TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(-j));
        boolean p0 = xc2.p0(M02);
        this.c = p0;
        if (j == yac.h(i).e()) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        setWillNotDraw(false);
        ir8 ir8Var = new ir8(activity, (byte) 19);
        this.h = ir8Var;
        ir8Var.setElevation(hl.L(9.0f));
        ir8Var.setOutlineProvider(new yi((byte) 19));
        ir8Var.setClipToOutline(true);
        ir8Var.setOnTouchListener(new vqb((byte) 2));
        addView(ir8Var, tre.e(288, -1, 53));
        int i3 = hl.m;
        uc7 s1 = uc7.s1(i);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(20.0f));
        rb0 rb0Var = new rb0((vnb) null);
        if (z) {
            rb0Var.f(1);
            rb0Var.p = 0.75f;
            de0Var.setImageDrawable(rb0Var);
            String M03 = ob6.M0(2131745629, null);
            i2 = i3;
            M0 = ob6.G(s1.F1().j.size(), "Chats", new Object[0]);
            z2 = p0;
            z3 = z;
            str = M03;
        } else {
            i2 = i3;
            z2 = p0;
            z3 = z;
            if (p0) {
                if (M02 != null) {
                    chat = s1.M0(Long.valueOf(M02.linked_monoforum_id));
                } else {
                    chat = null;
                }
                chat = chat == null ? M02 : chat;
                if (chat == null) {
                    str = "";
                } else {
                    rb0Var.p(chat);
                    de0Var.f(chat, rb0Var);
                    str = chat.title;
                }
                M0 = ob6.M0(2131743638, null);
            } else if (M02 != null) {
                rb0Var.p(M02);
                de0Var.f(M02, rb0Var);
                str = M02.title;
                TLRPC.ChatFull N0 = s1.N0(M02.id);
                int i4 = (N0 == null || (i4 = N0.participants_count) <= 0) ? M02.participants_count : i4;
                if (i4 > 0) {
                    M0 = ob6.H(',', "Members", i4);
                } else {
                    M0 = ob6.M0(2131743651, null);
                }
            } else {
                TLRPC.User X1 = s1.X1(Long.valueOf(j));
                if (X1 == null) {
                    str = "";
                } else {
                    rb0Var.q(X1);
                    de0Var.f(X1, rb0Var);
                    str = lbc.r(X1);
                }
                M0 = ob6.M0(2131743651, null);
            }
        }
        h8b h8bVar = new h8b(activity);
        int i5 = aob.G6;
        boolean z4 = z2;
        boolean z5 = z3;
        h8bVar.setBackground(aob.Y(aob.p1(0.06f, aob.v0(i5, vnbVar)), 24, 24));
        h8bVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                byte b = r2;
                cs1 cs1Var2 = cs1Var;
                switch (b) {
                    case 0:
                        zu1 zu1Var = cs1Var2.a;
                        zu1Var.n0.d();
                        if (zu1Var.d8()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", zu1Var.getUserConfig().e());
                            zu1Var.presentFragment(new em6(bundle, null));
                            return;
                        }
                        boolean p02 = xc2.p0(zu1Var.e);
                        TLRPC.Chat chat2 = zu1Var.e;
                        if (p02) {
                            zu1Var.presentFragment(ProfileActivity.Q2(-chat2.linked_monoforum_id));
                            return;
                        } else if (chat2 != null) {
                            zu1Var.presentFragment(ProfileActivity.Q2(-chat2.id));
                            return;
                        } else {
                            TLRPC.User user2 = zu1Var.f;
                            if (user2 != null) {
                                zu1Var.presentFragment(ProfileActivity.Q2(user2.id));
                                return;
                            }
                            return;
                        }
                    default:
                        zu1 zu1Var2 = cs1Var2.a;
                        s7 s7Var = zu1Var2.j0;
                        if (s7Var != null && zu1Var2.n0 != null) {
                            s7Var.z();
                            p7 p7Var = s7Var.R;
                            if (p7Var != null) {
                                p7Var.W();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = zu1Var2.j0.getPopupLayout();
                            fu5 J = fu5.J(zu1Var2, view);
                            boolean z6 = true;
                            for (int i6 = 0; i6 < popupLayout.getItemsCount(); i6++) {
                                View childAt = popupLayout.M.getChildAt(i6);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof k8) {
                                        if (!z6) {
                                            J.j();
                                            z6 = true;
                                        }
                                    } else if (childAt instanceof b8) {
                                        b8 b8Var = (b8) childAt;
                                        CharSequence text = b8Var.getTextView().getText();
                                        if (b8Var.getIconResId() == 0) {
                                            drawable = b8Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((b8Var.getTag() instanceof Integer) && ((Integer) b8Var.getTag()).intValue() == 29) {
                                            drawable2 = new b29(2131623944, hl.L(24.0f), hl.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        q7 q7Var = zu1Var2.t1;
                                        if (q7Var != null && b8Var == q7Var.j) {
                                            if (zu1Var2.getMessagesController().p2(zu1Var2.l6, zu1Var2.c(), null)) {
                                                J.b(b8Var.getIconResId(), text, new gn1(zu1Var2, (byte) 8), false);
                                            } else {
                                                J.b(b8Var.getIconResId(), text, new jj1(zu1Var2, J, (byte) 10), false);
                                            }
                                        } else if (b8Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) b8Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            J.a(b8Var.getIconResId(), drawable3, text, null, aob.F8, aob.E8, new ul1(zu1Var2, intValue, (byte) 8));
                                            if (drawable3 instanceof b29) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof b8) {
                                                    b8 b8Var2 = (b8) childAt2;
                                                    if (b8Var2.getImageView() instanceof e29) {
                                                        e29 e29Var = (e29) b8Var2.getImageView();
                                                        e29Var.setAnimation((b29) drawable3);
                                                        e29Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            J.a(b8Var.getIconResId(), drawable2, text, null, aob.F8, aob.E8, new fv0(b8Var, (byte) 29));
                                        }
                                        z6 = false;
                                    }
                                }
                            }
                            J.W(5);
                            J.b0(0.0f, -view.getHeight());
                            J.a0();
                            return;
                        }
                        return;
                }
            }
        });
        ir8Var.addView(h8bVar, tre.f(48.0f, -1, 51, hl.L(6.0f), i2 - hl.L(1.0f), hl.L(52.0f), 0));
        h8bVar.addView(de0Var, tre.f(40.0f, 40, 51, hl.L(6.0f), hl.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231247);
        int v0 = aob.v0(i5, vnbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        imageView.setBackground(aob.f0(aob.p1(0.06f, aob.v0(i5, vnbVar)), 1, -1));
        imageView.setContentDescription(ob6.M0(2131754834, null));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                byte b = r2;
                cs1 cs1Var2 = cs1Var;
                switch (b) {
                    case 0:
                        zu1 zu1Var = cs1Var2.a;
                        zu1Var.n0.d();
                        if (zu1Var.d8()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", zu1Var.getUserConfig().e());
                            zu1Var.presentFragment(new em6(bundle, null));
                            return;
                        }
                        boolean p02 = xc2.p0(zu1Var.e);
                        TLRPC.Chat chat2 = zu1Var.e;
                        if (p02) {
                            zu1Var.presentFragment(ProfileActivity.Q2(-chat2.linked_monoforum_id));
                            return;
                        } else if (chat2 != null) {
                            zu1Var.presentFragment(ProfileActivity.Q2(-chat2.id));
                            return;
                        } else {
                            TLRPC.User user2 = zu1Var.f;
                            if (user2 != null) {
                                zu1Var.presentFragment(ProfileActivity.Q2(user2.id));
                                return;
                            }
                            return;
                        }
                    default:
                        zu1 zu1Var2 = cs1Var2.a;
                        s7 s7Var = zu1Var2.j0;
                        if (s7Var != null && zu1Var2.n0 != null) {
                            s7Var.z();
                            p7 p7Var = s7Var.R;
                            if (p7Var != null) {
                                p7Var.W();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = zu1Var2.j0.getPopupLayout();
                            fu5 J = fu5.J(zu1Var2, view);
                            boolean z6 = true;
                            for (int i6 = 0; i6 < popupLayout.getItemsCount(); i6++) {
                                View childAt = popupLayout.M.getChildAt(i6);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof k8) {
                                        if (!z6) {
                                            J.j();
                                            z6 = true;
                                        }
                                    } else if (childAt instanceof b8) {
                                        b8 b8Var = (b8) childAt;
                                        CharSequence text = b8Var.getTextView().getText();
                                        if (b8Var.getIconResId() == 0) {
                                            drawable = b8Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((b8Var.getTag() instanceof Integer) && ((Integer) b8Var.getTag()).intValue() == 29) {
                                            drawable2 = new b29(2131623944, hl.L(24.0f), hl.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        q7 q7Var = zu1Var2.t1;
                                        if (q7Var != null && b8Var == q7Var.j) {
                                            if (zu1Var2.getMessagesController().p2(zu1Var2.l6, zu1Var2.c(), null)) {
                                                J.b(b8Var.getIconResId(), text, new gn1(zu1Var2, (byte) 8), false);
                                            } else {
                                                J.b(b8Var.getIconResId(), text, new jj1(zu1Var2, J, (byte) 10), false);
                                            }
                                        } else if (b8Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) b8Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            J.a(b8Var.getIconResId(), drawable3, text, null, aob.F8, aob.E8, new ul1(zu1Var2, intValue, (byte) 8));
                                            if (drawable3 instanceof b29) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof b8) {
                                                    b8 b8Var2 = (b8) childAt2;
                                                    if (b8Var2.getImageView() instanceof e29) {
                                                        e29 e29Var = (e29) b8Var2.getImageView();
                                                        e29Var.setAnimation((b29) drawable3);
                                                        e29Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            J.a(b8Var.getIconResId(), drawable2, text, null, aob.F8, aob.E8, new fv0(b8Var, (byte) 29));
                                        }
                                        z6 = false;
                                    }
                                }
                            }
                            J.W(5);
                            J.b0(0.0f, -view.getHeight());
                            J.a0();
                            return;
                        }
                        return;
                }
            }
        });
        ir8Var.addView(imageView, tre.f(40.0f, 40, 53, 0, hl.L(3.0f) + i2, hl.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(hl.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(aob.v0(i5, vnbVar));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        h8bVar.addView(textView, tre.f(-2.0f, -1, 51, hl.L(58.0f), hl.L(7.0f), hl.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i6 = aob.y6;
        textView2.setTextColor(aob.v0(i6, vnbVar));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        h8bVar.addView(textView2, tre.f(-2.0f, -1, 51, hl.L(58.0f), hl.L(26.0f), hl.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = hl.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new g0c(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131232502);
        imageView2.setColorFilter(new PorterDuffColorFilter(aob.v0(i6, vnbVar), mode));
        frameLayout.addView(imageView2, tre.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(ob6.M0(2131745564, null));
        editText.setHintTextColor(aob.v0(i6, vnbVar));
        editText.setTextColor(aob.v0(i5, vnbVar));
        editText.addTextChangedListener(new nh6(this, (byte) 20));
        frameLayout.addView(editText, tre.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ir8Var.addView(frameLayout, tre.f(48.0f, -1, 51, hl.L(12.0f) - L, (hl.L(56.0f) + i2) - L, hl.L(8.0f) - L, 0));
        d79 d79Var = new d79(activity, vnbVar);
        this.r = d79Var;
        d79Var.setLayoutManager(new x46());
        d79Var.setPadding(0, hl.L(4.0f), 0, hl.L(8.0f));
        d79Var.setClipToPadding(false);
        d79Var.setVerticalScrollBarEnabled(false);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        k43 k43Var = k43.h;
        zb3Var.i = k43Var;
        zb3Var.n(350L);
        zb3Var.d = (short) 160;
        d79Var.setItemAnimator(zb3Var);
        d79Var.setSelectorRadius(hl.L(16.0f));
        d79Var.setSelectorDrawableColor(aob.p1(0.06f, aob.v0(i5, vnbVar)));
        i0c i0cVar = new i0c(this);
        this.s = i0cVar;
        d79Var.setAdapter(i0cVar);
        d79Var.setOnItemClickListener(new l0(this, cs1Var, (byte) 22));
        d79Var.setOnItemLongClickListener((t69) new yw9(this, cs1Var, (byte) 16));
        d79Var.j(new h0c(this, i, j));
        ir8Var.addView(d79Var, tre.f(-1.0f, -1, 119, hl.L(8.0f), hl.L(100.0f) + i2, hl.L(8.0f), 0));
        qob qobVar = new qob(activity, vnbVar, (byte) 13);
        this.S = qobVar;
        qobVar.setLayoutManager(new x46(0, false));
        qobVar.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        qobVar.setClipToPadding(false);
        qobVar.setHorizontalScrollBarEnabled(false);
        qobVar.setOverScrollMode(2);
        zb3 zb3Var2 = new zb3();
        zb3Var2.m = false;
        zb3Var2.C = false;
        zb3Var2.o(k43Var);
        zb3Var2.n(320L);
        qobVar.setItemAnimator(zb3Var2);
        ox0 ox0Var = new ox0(this, (byte) 11);
        this.T = ox0Var;
        qobVar.setAdapter(ox0Var);
        qobVar.setOnItemClickListener(new t39(this, (byte) 26));
        qobVar.setVisibility(8);
        ir8Var.addView(qobVar, tre.f(36.0f, -1, 51, 0, hl.L(100.0f) + i2, 0, 0));
        int i7 = aob.d6;
        int v02 = aob.v0(i7, vnbVar);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v02, vm2.o(v02, 0)}));
        ir8Var.addView(view, tre.f(hl.L(16.0f), -1, 51, 0, hl.L(100.0f) + i2, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{v02, vm2.o(v02, 0)}));
        ir8Var.addView(view2, tre.e(-1, 24, 87));
        this.F = view;
        o();
        if (j > 0) {
            user = uc7.s1(i).X1(Long.valueOf(j));
        } else {
            user = null;
        }
        if (!z4 && !z5 && ((M02 != null && xc2.w(15, M02)) || lbc.x(user))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(hl.L(25.0f));
            gradientDrawable.setColor(vm2.o(v02, 224));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(hl.L(2.0f));
            frameLayout2.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(hl.o());
            int i8 = aob.Ji;
            textView3.setTextColor(aob.v0(i8, vnbVar));
            textView3.setText(ob6.M0(2131748005, null));
            textView3.setGravity(17);
            textView3.setPadding(hl.L(20.0f), 0, hl.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(hl.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231179).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(i8, vnbVar), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(aob.b0(hl.L(22.0f), aob.v0(aob.Fi, vnbVar)));
            iye.a(textView3);
            textView3.setOnClickListener(new jjb(this, cs1Var, (byte) 2));
            frameLayout2.addView(textView3, tre.c(44.0f, -2));
            ir8Var.addView(frameLayout2, tre.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        ir8Var.setBackgroundColor(aob.v0(i7, vnbVar));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    private void setTagsShown(boolean z) {
        float f;
        if (this.j0 == z) {
            return;
        }
        this.j0 = z;
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b0 = null;
        }
        float f2 = this.a0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new a0c(this, (byte) 1));
        this.b0.addListener(new f0c(this, (byte) 0));
        this.b0.setDuration(320L);
        this.b0.setInterpolator(k43.h);
        this.b0.start();
    }

    public final void a(float f, float f2) {
        long j;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f3 = this.y;
        if (f3 == f) {
            setProgress(f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new a0c(this, (byte) 2));
        this.K.addListener(new f0c(this, (byte) 2));
        float abs = Math.abs(f - this.y) * getPanelWidth();
        if (Math.abs(f2) > hl.L(300.0f)) {
            j = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f2)) * 1000.0f * 2.0f));
        } else {
            j = 320;
        }
        this.K.setDuration(j);
        this.K.setInterpolator(k43.h);
        this.K.start();
    }

    public final void b(float f) {
        qob qobVar = this.S;
        int childCount = qobVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = qobVar.getChildAt(i);
            float R1 = hl.R1(0.6f, 1.0f, f);
            childAt.setScaleX(R1);
            childAt.setScaleY(R1);
            childAt.setAlpha(f);
        }
    }

    public final void c() {
        c0c c0cVar = this.P;
        if (c0cVar != null) {
            hl.r(c0cVar);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        hl.t1(this.w);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.t5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                n();
            }
        } else if (i == 2) {
            n();
        } else if (i == jn7.i3) {
            if (this.d) {
                n();
            }
        } else if (i == jn7.l4) {
            hl.d0(this.r, new bm0((byte) 12));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int p1 = aob.p1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(p1);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        cs1 cs1Var = this.f;
        if (cs1Var != null && this.y > 0.0f) {
            cs1Var.a.A6(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c0 = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i = 0;
        this.c0 = false;
        if (this.y <= 0.0f) {
            i = 8;
        }
        setVisibility(i);
        return dispatchTouchEvent;
    }

    public final TLObject e(j0c j0cVar) {
        long n;
        uc7 s1 = uc7.s1(this.a);
        mt9 mt9Var = j0cVar.b;
        if (mt9Var != null) {
            n = mt9Var.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = j0cVar.a;
            if (tL_forumTopic != null && this.c) {
                n = wf3.n(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (n >= 0) {
            return s1.X1(Long.valueOf(n));
        }
        return s1.M0(Long.valueOf(-n));
    }

    public final String f(long j) {
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        if (j == yac.h(i).e()) {
            return ob6.M0(2131748057, null);
        }
        if (j == 2666000) {
            return ob6.M0(2131754245, null);
        }
        if (j >= 0) {
            return lbc.r(s1.X1(Long.valueOf(j)));
        }
        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
        if (M0 != null) {
            return M0.title;
        }
        return "";
    }

    public final boolean g() {
        if (!this.d && !this.c && this.b < 0) {
            return true;
        }
        return false;
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.y;
    }

    public final boolean h() {
        if (this.V == 0 && this.W == null) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        if (!this.d && !this.c) {
            if (!TextUtils.isEmpty(this.M) || h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j() {
        if (this.P == null && this.O == 0 && !this.R && i()) {
            String str = this.M;
            long j = this.V;
            Boolean bool = this.W;
            qyb qybVar = uc7.s1(this.a).h4;
            long j2 = -this.b;
            pyb pybVar = this.Q;
            d0c d0cVar = new d0c(this, str, j, bool);
            qybVar.getClass();
            TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = qybVar.getMessagesController().j1(-j2);
            Long l = null;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            tL_messages_getForumTopics.q = str;
            if (j != 0) {
                l = Long.valueOf(j);
            }
            tL_messages_getForumTopics.icon_emoji_id = l;
            tL_messages_getForumTopics.closed = bool;
            if (pybVar != null) {
                tL_messages_getForumTopics.offset_date = pybVar.a;
                tL_messages_getForumTopics.offset_id = pybVar.b;
                tL_messages_getForumTopics.offset_topic = pybVar.c;
            }
            tL_messages_getForumTopics.limit = 50;
            this.O = qybVar.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new p87(qybVar, j2, d0cVar, (byte) 19));
        }
    }

    public final boolean k(j0c j0cVar) {
        if (h()) {
            TLRPC.TL_forumTopic tL_forumTopic = j0cVar.a;
            if (tL_forumTopic != null) {
                long j = this.V;
                if (j == 0 || tL_forumTopic.icon_emoji_id == j) {
                    Boolean bool = this.W;
                    if (bool != null && tL_forumTopic.closed != bool.booleanValue()) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void l(boolean z) {
        long j;
        c();
        this.N.clear();
        this.Q = null;
        this.R = false;
        if (!i()) {
            return;
        }
        c0c c0cVar = new c0c(this, (byte) 0);
        this.P = c0cVar;
        if (z) {
            j = 350;
        } else {
            j = 0;
        }
        hl.d3(c0cVar, j);
    }

    public final boolean m(j0c j0cVar) {
        String str;
        mt9 mt9Var = j0cVar.b;
        String str2 = "";
        if (mt9Var != null) {
            String f = f(mt9Var.a);
            if (f != null) {
                str2 = f.toString();
            }
        } else {
            TLObject e = e(j0cVar);
            if (e instanceof TLRPC.User) {
                str2 = lbc.r((TLRPC.User) e);
            } else if (e instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = j0cVar.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public final void n() {
        boolean z;
        float f;
        boolean z2;
        ArrayList l;
        boolean z3;
        String str;
        String str2;
        String str3;
        float f2;
        ArrayList arrayList;
        boolean z4;
        int visibility = getVisibility();
        i0c i0cVar = this.s;
        if (visibility != 0 && this.y <= 0.0f && i0cVar.c.size() > 0) {
            return;
        }
        ArrayList arrayList2 = i0cVar.c;
        String str4 = i0cVar.d;
        n0c n0cVar = i0cVar.e;
        long j = n0cVar.b;
        int i = n0cVar.a;
        String str5 = n0cVar.M;
        boolean z5 = n0cVar.d;
        if (TextUtils.equals(str4, str5) && n0cVar.y > 0.0f && !arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        i0cVar.d = n0cVar.M;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        if (z5) {
            f = 0.0f;
            z2 = z;
            l = null;
        } else {
            f = 0.0f;
            z2 = z;
            l = uc7.s1(i).h4.l(-j);
        }
        if (!z5) {
            ox0 ox0Var = n0cVar.T;
            ArrayList arrayList4 = n0cVar.U;
            if (n0cVar.g()) {
                f2 = f;
                arrayList = (ArrayList) uc7.s1(i).h4.f.f(-j);
            } else {
                f2 = f;
                arrayList = null;
            }
            ArrayList arrayList5 = new ArrayList();
            z3 = z5;
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    long longValue = ((Long) obj).longValue();
                    if (longValue != 0) {
                        ArrayList arrayList6 = arrayList;
                        ?? obj2 = new Object();
                        obj2.a = longValue;
                        arrayList5.add(obj2);
                        arrayList = arrayList6;
                    }
                }
            }
            if (n0cVar.g()) {
                boolean[] zArr = {false, true};
                for (int i3 = 0; i3 < 2; i3++) {
                    boolean z6 = zArr[i3];
                    ?? obj3 = new Object();
                    obj3.b = Boolean.valueOf(z6);
                    arrayList5.add(obj3);
                }
            }
            if (arrayList5.isEmpty() && n0cVar.h()) {
                n0cVar.V = 0L;
                str = null;
                n0cVar.W = null;
                n0cVar.l(false);
            } else {
                str = null;
            }
            ArrayList arrayList7 = new ArrayList(arrayList4);
            arrayList4.clear();
            arrayList4.addAll(arrayList5);
            if (!arrayList7.isEmpty() && !arrayList5.isEmpty() && n0cVar.a0 > f2) {
                ja jaVar = new ja(arrayList7, arrayList5);
                z4 = true;
                cy7.a(jaVar, true).c(ox0Var);
            } else {
                z4 = true;
                ox0Var.f();
            }
            n0cVar.setTagsShown(arrayList4.isEmpty() ^ z4);
        } else {
            z3 = z5;
            str = null;
        }
        if (TextUtils.isEmpty(n0cVar.M) && !n0cVar.h()) {
            arrayList2.add(new j0c(n0cVar));
        }
        if (z3) {
            ArrayList arrayList8 = uc7.s1(i).F1().j;
            int size2 = arrayList8.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj4 = arrayList8.get(i4);
                i4++;
                j0c j0cVar = new j0c(n0cVar);
                j0cVar.b = (mt9) obj4;
                if (!TextUtils.isEmpty(n0cVar.M) && !n0cVar.m(j0cVar)) {
                    TLObject e = n0cVar.e(j0cVar);
                    if (e instanceof TLRPC.User) {
                        str3 = lbc.p((TLRPC.User) e);
                    } else if (e instanceof TLRPC.Chat) {
                        str3 = xc2.K((TLRPC.Chat) e, false);
                    } else {
                        str3 = str;
                    }
                    if (str3 != null && str3.toLowerCase().contains(n0cVar.M)) {
                    }
                }
                arrayList2.add(j0cVar);
            }
            i0cVar.E(arrayList3, z2);
        } else {
            boolean z7 = z2;
            HashSet hashSet = new HashSet();
            if (l != null) {
                int size3 = l.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = l.get(i5);
                    i5++;
                    j0c j0cVar2 = new j0c(n0cVar);
                    j0cVar2.a = (TLRPC.TL_forumTopic) obj5;
                    if (!TextUtils.isEmpty(n0cVar.M) && !n0cVar.m(j0cVar2)) {
                        TLObject e2 = n0cVar.e(j0cVar2);
                        if (e2 instanceof TLRPC.User) {
                            str2 = lbc.p((TLRPC.User) e2);
                        } else if (e2 instanceof TLRPC.Chat) {
                            str2 = xc2.K((TLRPC.Chat) e2, false);
                        } else {
                            str2 = str;
                        }
                        if (str2 != null && str2.toLowerCase().contains(n0cVar.M)) {
                        }
                    }
                    if (n0cVar.k(j0cVar2)) {
                        arrayList2.add(j0cVar2);
                        hashSet.add(Long.valueOf(j0cVar2.a()));
                    }
                }
            }
            if (n0cVar.i()) {
                ArrayList arrayList9 = n0cVar.N;
                int size4 = arrayList9.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj6 = arrayList9.get(i6);
                    i6++;
                    j0c j0cVar3 = new j0c(n0cVar);
                    j0cVar3.a = (TLRPC.TL_forumTopic) obj6;
                    if (n0cVar.k(j0cVar3) && hashSet.add(Long.valueOf(j0cVar3.a()))) {
                        arrayList2.add(j0cVar3);
                    }
                }
            }
            i0cVar.E(arrayList3, z7);
        }
        this.r.post(new c0c(this, (byte) 1));
    }

    public final void o() {
        View view;
        View view2 = this.F;
        if (view2 != null && (view = this.G) != null) {
            d79 d79Var = this.r;
            view2.setAlpha(Utilities.i(d79Var.computeVerticalScrollOffset() / hl.L(16.0f), 1.0f, 0.0f));
            if (this.E != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((d79Var.computeVerticalScrollRange() - d79Var.computeVerticalScrollOffset()) - d79Var.computeVerticalScrollExtent()) / hl.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        jn7.f(i).a(this, jn7.t5);
        jn7.f(i).a(this, 2);
        jn7.f(i).a(this, jn7.i3);
        jn7.e().a(this, jn7.l4);
        if (g()) {
            qyb qybVar = uc7.s1(i).h4;
            long j = -this.b;
            LongSparseIntArray longSparseIntArray = qybVar.n;
            long j2 = -j;
            if (!qybVar.getMessagesController().B2(j2) && longSparseIntArray.get(j, 0) == 0 && System.currentTimeMillis() - qybVar.h.get(j, 0L) >= 300000) {
                longSparseIntArray.put(j, 1);
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = qybVar.getMessagesController().j1(j2);
                tL_messages_getForumTopics.limit = 1;
                qybVar.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new yu2(qybVar, j, (byte) 7));
            }
        }
        n();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        jn7.f(i).n(this, jn7.t5);
        jn7.f(i).n(this, 2);
        jn7.f(i).n(this, jn7.i3);
        jn7.e().n(this, jn7.l4);
        c();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.d0 = motionEvent.getX();
            this.e0 = motionEvent.getY();
            this.f0 = false;
            this.g0 = true;
            this.h0 = this.y;
            VelocityTracker velocityTracker = this.i0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.i0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.g0) {
            VelocityTracker velocityTracker2 = this.i0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x = motionEvent.getX() - this.d0;
            float y = motionEvent.getY() - this.e0;
            if (x > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x) > Math.abs(y) * 1.5f) {
                this.f0 = true;
                this.d0 = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        WeakHashMap weakHashMap = ihc.a;
        l2d a = bhc.a(this);
        if (a != null) {
            i5 = a.a.f(2).d;
        } else {
            i5 = 0;
        }
        if (i5 != this.H) {
            this.H = i5;
            d79 d79Var = this.r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = hl.L(8.0f) + i5;
                view.getLayoutParams().height = hl.L(64.0f) + i5;
                d79Var.setPadding(0, hl.L(4.0f), 0, hl.L(66.0f) + i5);
            } else {
                view.getLayoutParams().height = hl.L(24.0f) + i5;
                d79Var.setPadding(0, hl.L(4.0f), 0, hl.L(8.0f) + i5);
            }
            this.h.requestLayout();
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        zu1 zu1Var;
        s7 p7;
        a aVar;
        WeakHashMap weakHashMap = ihc.a;
        l2d a = bhc.a(this);
        int i4 = 0;
        if (a != null) {
            i3 = hl.H0(a, false).c;
        } else {
            i3 = 0;
        }
        int i5 = this.I;
        ir8 ir8Var = this.h;
        if (i3 != i5) {
            this.I = i3;
            ir8Var.getLayoutParams().width = getPanelWidth();
            ir8Var.setPadding(0, 0, i3, 0);
            ir8Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i);
        cs1 cs1Var = this.f;
        if (cs1Var != null && (p7 = (zu1Var = cs1Var.a).p7()) != null) {
            aVar = ((e) zu1Var).actionBar;
            i4 = (int) ((aVar.getWidth() - ((p7.getWidth() / 2.0f) + (p7.getX() + ((View) p7.getParent()).getX()))) + hl.L(31.0f));
        }
        int max = Math.max(hl.L(200.0f), Math.min(hl.L(288.0f), (size - this.I) - i4));
        if (max != this.J) {
            this.J = max;
            ir8Var.getLayoutParams().width = getPanelWidth();
            ir8Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j) {
        this.L = j;
        this.s.f();
    }

    public void setMenuAvailable(boolean z) {
        int i;
        ImageView imageView = this.n;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setProgress(float f) {
        boolean z;
        int i = 0;
        if (this.y <= 0.0f && f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.y = Utilities.l(f);
        if (z && this.S != null) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.j0 && this.b0 == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.k0 = ofFloat;
                ofFloat.addUpdateListener(new a0c(this, (byte) 0));
                this.k0.addListener(new f0c(this, (byte) 1));
                this.k0.setDuration(320L);
                this.k0.setInterpolator(k43.h);
                this.k0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        if (this.y <= 0.0f && !this.c0) {
            i = 8;
        }
        setVisibility(i);
        invalidate();
        cs1 cs1Var = this.f;
        if (cs1Var != null) {
            cs1Var.a.m1.invalidate();
        }
    }

    public void settle(float f) {
        boolean z = false;
        float f2 = 0.0f;
        if (Math.abs(f) <= hl.L(300.0f) ? this.y > 0.5f : f < 0.0f) {
            z = true;
        }
        if (z) {
            n();
            f2 = 1.0f;
        }
        a(f2, f);
        if (!z) {
            hl.t1(this.w);
        }
    }
}
