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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class oyb extends FrameLayout implements jm7 {
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
    public cyb P;
    public pwb Q;
    public boolean R;
    public final smb S;
    public final ny0 T;
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
    public final ylb e;
    public float e0;
    public final bt1 f;
    public boolean f0;
    public boolean g0;
    public final ct8 h;
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
    public final r59 r;
    public final jyb s;
    public final EditText w;
    public final Paint x;
    public float y;

    public oyb(Activity activity, int i, long j, ylb ylbVar, final bt1 bt1Var) {
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
        this.J = gm.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.U = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.l0 = textPaint;
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setTypeface(gm.o());
        this.m0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.n0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.o0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.p0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.q0 = textPaint5;
        textPaint2.setTextSize(gm.L(16.0f));
        textPaint2.setTypeface(gm.o());
        textPaint3.setTextSize(gm.L(13.0f));
        textPaint4.setTextSize(gm.L(15.0f));
        hg9.o(textPaint5, gm.L(12.0f));
        this.a = i;
        this.b = j;
        this.e = ylbVar;
        this.f = bt1Var;
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        boolean p0 = sd2.p0(L0);
        this.c = p0;
        if (j == z8c.h(i).e()) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        setWillNotDraw(false);
        ct8 ct8Var = new ct8(activity, (byte) 18);
        this.h = ct8Var;
        ct8Var.setElevation(gm.L(9.0f));
        ct8Var.setOutlineProvider(new xj((byte) 20));
        ct8Var.setClipToOutline(true);
        ct8Var.setOnTouchListener(new xob((byte) 2));
        addView(ct8Var, qoe.e(288, -1, 53));
        int i3 = gm.m;
        oc7 r1 = oc7.r1(i);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setRoundRadius(gm.L(20.0f));
        pc0 pc0Var = new pc0((ylb) null);
        if (z) {
            pc0Var.f(1);
            pc0Var.p = 0.75f;
            bf0Var.setImageDrawable(pc0Var);
            String M02 = jb6.M0(2131745635, null);
            i2 = i3;
            M0 = jb6.G(r1.E1().j.size(), "Chats", new Object[0]);
            z2 = p0;
            z3 = z;
            str = M02;
        } else {
            i2 = i3;
            z2 = p0;
            z3 = z;
            if (p0) {
                if (L0 != null) {
                    chat = r1.L0(Long.valueOf(L0.linked_monoforum_id));
                } else {
                    chat = null;
                }
                chat = chat == null ? L0 : chat;
                if (chat == null) {
                    str = "";
                } else {
                    pc0Var.p(chat);
                    bf0Var.f(chat, pc0Var);
                    str = chat.title;
                }
                M0 = jb6.M0(2131743670, null);
            } else if (L0 != null) {
                pc0Var.p(L0);
                bf0Var.f(L0, pc0Var);
                str = L0.title;
                TLRPC.ChatFull M03 = r1.M0(L0.id);
                int i4 = (M03 == null || (i4 = M03.participants_count) <= 0) ? L0.participants_count : i4;
                if (i4 > 0) {
                    M0 = jb6.H(',', "Members", i4);
                } else {
                    M0 = jb6.M0(2131743683, null);
                }
            } else {
                TLRPC.User W1 = r1.W1(Long.valueOf(j));
                if (W1 == null) {
                    str = "";
                } else {
                    pc0Var.q(W1);
                    bf0Var.f(W1, pc0Var);
                    str = m9c.r(W1);
                }
                M0 = jb6.M0(2131743683, null);
            }
        }
        bdb bdbVar = new bdb(activity);
        int i5 = cmb.F6;
        boolean z4 = z2;
        boolean z5 = z3;
        bdbVar.setBackground(cmb.Y(cmb.p1(0.06f, cmb.v0(i5, ylbVar)), 24, 24));
        bdbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                byte b = r2;
                bt1 bt1Var2 = bt1Var;
                switch (b) {
                    case 0:
                        yv1 yv1Var = bt1Var2.a;
                        yv1Var.n0.d();
                        if (yv1Var.d8()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", yv1Var.getUserConfig().e());
                            yv1Var.presentFragment(new cm6(bundle, null));
                            return;
                        }
                        boolean p02 = sd2.p0(yv1Var.e);
                        TLRPC.Chat chat2 = yv1Var.e;
                        if (p02) {
                            yv1Var.presentFragment(ProfileActivity.S2(-chat2.linked_monoforum_id));
                            return;
                        } else if (chat2 != null) {
                            yv1Var.presentFragment(ProfileActivity.S2(-chat2.id));
                            return;
                        } else {
                            TLRPC.User user2 = yv1Var.f;
                            if (user2 != null) {
                                yv1Var.presentFragment(ProfileActivity.S2(user2.id));
                                return;
                            }
                            return;
                        }
                    default:
                        yv1 yv1Var2 = bt1Var2.a;
                        r7 r7Var = yv1Var2.j0;
                        if (r7Var != null && yv1Var2.n0 != null) {
                            r7Var.z();
                            o7 o7Var = r7Var.R;
                            if (o7Var != null) {
                                o7Var.h2();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = yv1Var2.j0.getPopupLayout();
                            bu5 J = bu5.J(yv1Var2, view);
                            boolean z6 = true;
                            for (int i6 = 0; i6 < popupLayout.getItemsCount(); i6++) {
                                View childAt = popupLayout.M.getChildAt(i6);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof j8) {
                                        if (!z6) {
                                            J.j();
                                            z6 = true;
                                        }
                                    } else if (childAt instanceof a8) {
                                        a8 a8Var = (a8) childAt;
                                        CharSequence text = a8Var.getTextView().getText();
                                        if (a8Var.getIconResId() == 0) {
                                            drawable = a8Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((a8Var.getTag() instanceof Integer) && ((Integer) a8Var.getTag()).intValue() == 29) {
                                            drawable2 = new p09(2131623944, gm.L(24.0f), gm.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        p7 p7Var = yv1Var2.t1;
                                        if (p7Var != null && a8Var == p7Var.j) {
                                            if (yv1Var2.getMessagesController().o2(yv1Var2.l6, yv1Var2.d(), null)) {
                                                J.b(a8Var.getIconResId(), text, new en1(yv1Var2, (byte) 24), false);
                                            } else {
                                                J.b(a8Var.getIconResId(), text, new uj1(yv1Var2, J, (byte) 6), false);
                                            }
                                        } else if (a8Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) a8Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            J.a(a8Var.getIconResId(), drawable3, text, cmb.E8, cmb.D8, new vm1(yv1Var2, intValue, (byte) 3));
                                            if (drawable3 instanceof p09) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof a8) {
                                                    a8 a8Var2 = (a8) childAt2;
                                                    if (a8Var2.getImageView() instanceof s09) {
                                                        s09 s09Var = (s09) a8Var2.getImageView();
                                                        s09Var.setAnimation((p09) drawable3);
                                                        s09Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            J.a(a8Var.getIconResId(), drawable2, text, cmb.E8, cmb.D8, new fo1(a8Var, (byte) 0));
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
        ct8Var.addView(bdbVar, qoe.f(48.0f, -1, 51, gm.L(6.0f), i2 - gm.L(1.0f), gm.L(52.0f), 0));
        bdbVar.addView(bf0Var, qoe.f(40.0f, 40, 51, gm.L(6.0f), gm.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231248);
        int v0 = cmb.v0(i5, ylbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        imageView.setBackground(cmb.f0(cmb.p1(0.06f, cmb.v0(i5, ylbVar)), 1, -1));
        imageView.setContentDescription(jb6.M0(2131754838, null));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                byte b = r2;
                bt1 bt1Var2 = bt1Var;
                switch (b) {
                    case 0:
                        yv1 yv1Var = bt1Var2.a;
                        yv1Var.n0.d();
                        if (yv1Var.d8()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", yv1Var.getUserConfig().e());
                            yv1Var.presentFragment(new cm6(bundle, null));
                            return;
                        }
                        boolean p02 = sd2.p0(yv1Var.e);
                        TLRPC.Chat chat2 = yv1Var.e;
                        if (p02) {
                            yv1Var.presentFragment(ProfileActivity.S2(-chat2.linked_monoforum_id));
                            return;
                        } else if (chat2 != null) {
                            yv1Var.presentFragment(ProfileActivity.S2(-chat2.id));
                            return;
                        } else {
                            TLRPC.User user2 = yv1Var.f;
                            if (user2 != null) {
                                yv1Var.presentFragment(ProfileActivity.S2(user2.id));
                                return;
                            }
                            return;
                        }
                    default:
                        yv1 yv1Var2 = bt1Var2.a;
                        r7 r7Var = yv1Var2.j0;
                        if (r7Var != null && yv1Var2.n0 != null) {
                            r7Var.z();
                            o7 o7Var = r7Var.R;
                            if (o7Var != null) {
                                o7Var.h2();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = yv1Var2.j0.getPopupLayout();
                            bu5 J = bu5.J(yv1Var2, view);
                            boolean z6 = true;
                            for (int i6 = 0; i6 < popupLayout.getItemsCount(); i6++) {
                                View childAt = popupLayout.M.getChildAt(i6);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof j8) {
                                        if (!z6) {
                                            J.j();
                                            z6 = true;
                                        }
                                    } else if (childAt instanceof a8) {
                                        a8 a8Var = (a8) childAt;
                                        CharSequence text = a8Var.getTextView().getText();
                                        if (a8Var.getIconResId() == 0) {
                                            drawable = a8Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((a8Var.getTag() instanceof Integer) && ((Integer) a8Var.getTag()).intValue() == 29) {
                                            drawable2 = new p09(2131623944, gm.L(24.0f), gm.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        p7 p7Var = yv1Var2.t1;
                                        if (p7Var != null && a8Var == p7Var.j) {
                                            if (yv1Var2.getMessagesController().o2(yv1Var2.l6, yv1Var2.d(), null)) {
                                                J.b(a8Var.getIconResId(), text, new en1(yv1Var2, (byte) 24), false);
                                            } else {
                                                J.b(a8Var.getIconResId(), text, new uj1(yv1Var2, J, (byte) 6), false);
                                            }
                                        } else if (a8Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) a8Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            J.a(a8Var.getIconResId(), drawable3, text, cmb.E8, cmb.D8, new vm1(yv1Var2, intValue, (byte) 3));
                                            if (drawable3 instanceof p09) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof a8) {
                                                    a8 a8Var2 = (a8) childAt2;
                                                    if (a8Var2.getImageView() instanceof s09) {
                                                        s09 s09Var = (s09) a8Var2.getImageView();
                                                        s09Var.setAnimation((p09) drawable3);
                                                        s09Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            J.a(a8Var.getIconResId(), drawable2, text, cmb.E8, cmb.D8, new fo1(a8Var, (byte) 0));
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
        ct8Var.addView(imageView, qoe.f(40.0f, 40, 53, 0, gm.L(3.0f) + i2, gm.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(cmb.v0(i5, ylbVar));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        bdbVar.addView(textView, qoe.f(-2.0f, -1, 51, gm.L(58.0f), gm.L(7.0f), gm.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i6 = cmb.x6;
        textView2.setTextColor(cmb.v0(i6, ylbVar));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        bdbVar.addView(textView2, qoe.f(-2.0f, -1, 51, gm.L(58.0f), gm.L(26.0f), gm.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gm.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new hyb(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131232503);
        imageView2.setColorFilter(new PorterDuffColorFilter(cmb.v0(i6, ylbVar), mode));
        frameLayout.addView(imageView2, qoe.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(jb6.M0(2131745570, null));
        editText.setHintTextColor(cmb.v0(i6, ylbVar));
        editText.setTextColor(cmb.v0(i5, ylbVar));
        editText.addTextChangedListener(new og6(this, (byte) 20));
        frameLayout.addView(editText, qoe.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ct8Var.addView(frameLayout, qoe.f(48.0f, -1, 51, gm.L(12.0f) - L, (gm.L(56.0f) + i2) - L, gm.L(8.0f) - L, 0));
        r59 r59Var = new r59(activity, ylbVar);
        this.r = r59Var;
        r59Var.setLayoutManager(new u46());
        r59Var.setPadding(0, gm.L(4.0f), 0, gm.L(8.0f));
        r59Var.setClipToPadding(false);
        r59Var.setVerticalScrollBarEnabled(false);
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        d53 d53Var = d53.h;
        sc3Var.i = d53Var;
        sc3Var.n(350L);
        sc3Var.d = (short) 160;
        r59Var.setItemAnimator(sc3Var);
        r59Var.setSelectorRadius(gm.L(16.0f));
        r59Var.setSelectorDrawableColor(cmb.p1(0.06f, cmb.v0(i5, ylbVar)));
        jyb jybVar = new jyb(this);
        this.s = jybVar;
        r59Var.setAdapter(jybVar);
        r59Var.setOnItemClickListener(new k0(this, bt1Var, (byte) 22));
        r59Var.setOnItemLongClickListener((h59) new uxb(this, bt1Var, (byte) 1));
        r59Var.j(new iyb(this, i, j));
        ct8Var.addView(r59Var, qoe.f(-1.0f, -1, 119, gm.L(8.0f), gm.L(100.0f) + i2, gm.L(8.0f), 0));
        smb smbVar = new smb(activity, ylbVar, (byte) 13);
        this.S = smbVar;
        smbVar.setLayoutManager(new u46(0, false));
        smbVar.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        smbVar.setClipToPadding(false);
        smbVar.setHorizontalScrollBarEnabled(false);
        smbVar.setOverScrollMode(2);
        sc3 sc3Var2 = new sc3();
        sc3Var2.m = false;
        sc3Var2.C = false;
        sc3Var2.o(d53Var);
        sc3Var2.n(320L);
        smbVar.setItemAnimator(sc3Var2);
        ny0 ny0Var = new ny0(this, (byte) 11);
        this.T = ny0Var;
        smbVar.setAdapter(ny0Var);
        smbVar.setOnItemClickListener(new s19(this, (byte) 27));
        smbVar.setVisibility(8);
        ct8Var.addView(smbVar, qoe.f(36.0f, -1, 51, 0, gm.L(100.0f) + i2, 0, 0));
        int i7 = cmb.c6;
        int v02 = cmb.v0(i7, ylbVar);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v02, on2.p(v02, 0)}));
        ct8Var.addView(view, qoe.f(gm.L(16.0f), -1, 51, 0, gm.L(100.0f) + i2, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{v02, on2.p(v02, 0)}));
        ct8Var.addView(view2, qoe.e(-1, 24, 87));
        this.F = view;
        o();
        if (j > 0) {
            user = oc7.r1(i).W1(Long.valueOf(j));
        } else {
            user = null;
        }
        if (!z4 && !z5 && ((L0 != null && sd2.w(15, L0)) || m9c.x(user))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(gm.L(25.0f));
            gradientDrawable.setColor(on2.p(v02, 224));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(gm.L(2.0f));
            frameLayout2.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(gm.o());
            int i8 = cmb.Ii;
            textView3.setTextColor(cmb.v0(i8, ylbVar));
            textView3.setText(jb6.M0(2131748008, null));
            textView3.setGravity(17);
            textView3.setPadding(gm.L(20.0f), 0, gm.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(gm.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231180).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(i8, ylbVar), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(cmb.b0(gm.L(22.0f), cmb.v0(cmb.Ei, ylbVar)));
            rve.a(textView3);
            textView3.setOnClickListener(new fyb(this, bt1Var, (byte) 0));
            frameLayout2.addView(textView3, qoe.c(44.0f, -2));
            ct8Var.addView(frameLayout2, qoe.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        ct8Var.setBackgroundColor(cmb.v0(i7, ylbVar));
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
        ofFloat.addUpdateListener(new ayb(this, (byte) 1));
        this.b0.addListener(new gyb(this, (byte) 0));
        this.b0.setDuration(320L);
        this.b0.setInterpolator(d53.h);
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
        ofFloat.addUpdateListener(new ayb(this, (byte) 2));
        this.K.addListener(new gyb(this, (byte) 2));
        float abs = Math.abs(f - this.y) * getPanelWidth();
        if (Math.abs(f2) > gm.L(300.0f)) {
            j = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f2)) * 1000.0f * 2.0f));
        } else {
            j = 320;
        }
        this.K.setDuration(j);
        this.K.setInterpolator(d53.h);
        this.K.start();
    }

    public final void b(float f) {
        smb smbVar = this.S;
        int childCount = smbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = smbVar.getChildAt(i);
            float R1 = gm.R1(0.6f, 1.0f, f);
            childAt.setScaleX(R1);
            childAt.setScaleY(R1);
            childAt.setAlpha(f);
        }
    }

    public final void c() {
        cyb cybVar = this.P;
        if (cybVar != null) {
            gm.r(cybVar);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        gm.t1(this.w);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.u5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                n();
            }
        } else if (i == 2) {
            n();
        } else if (i == nm7.i3) {
            if (this.d) {
                n();
            }
        } else if (i == nm7.m4) {
            gm.d0(this.r, new bn0((byte) 12));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int p1 = cmb.p1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(p1);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        bt1 bt1Var = this.f;
        if (bt1Var != null && this.y > 0.0f) {
            bt1Var.a.A6(canvas);
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

    public final TLObject e(kyb kybVar) {
        long n;
        oc7 r1 = oc7.r1(this.a);
        vr9 vr9Var = kybVar.b;
        if (vr9Var != null) {
            n = vr9Var.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = kybVar.a;
            if (tL_forumTopic != null && this.c) {
                n = pg3.n(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (n >= 0) {
            return r1.W1(Long.valueOf(n));
        }
        return r1.L0(Long.valueOf(-n));
    }

    public final String f(long j) {
        int i = this.a;
        oc7 r1 = oc7.r1(i);
        if (j == z8c.h(i).e()) {
            return jb6.M0(2131748060, null);
        }
        if (j == 2666000) {
            return jb6.M0(2131754217, null);
        }
        if (j >= 0) {
            return m9c.r(r1.W1(Long.valueOf(j)));
        }
        TLRPC.Chat L0 = r1.L0(Long.valueOf(-j));
        if (L0 != null) {
            return L0.title;
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
            qwb qwbVar = oc7.r1(this.a).g4;
            long j2 = -this.b;
            pwb pwbVar = this.Q;
            dyb dybVar = new dyb(this, str, j, bool);
            qwbVar.getClass();
            TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = qwbVar.getMessagesController().i1(-j2);
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
            if (pwbVar != null) {
                tL_messages_getForumTopics.offset_date = pwbVar.a;
                tL_messages_getForumTopics.offset_id = pwbVar.b;
                tL_messages_getForumTopics.offset_topic = pwbVar.c;
            }
            tL_messages_getForumTopics.limit = 50;
            this.O = qwbVar.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new jb7(qwbVar, j2, dybVar, (byte) 18));
        }
    }

    public final boolean k(kyb kybVar) {
        if (h()) {
            TLRPC.TL_forumTopic tL_forumTopic = kybVar.a;
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
        cyb cybVar = new cyb(this, (byte) 0);
        this.P = cybVar;
        if (z) {
            j = 350;
        } else {
            j = 0;
        }
        gm.d3(cybVar, j);
    }

    public final boolean m(kyb kybVar) {
        String str;
        vr9 vr9Var = kybVar.b;
        String str2 = "";
        if (vr9Var != null) {
            String f = f(vr9Var.a);
            if (f != null) {
                str2 = f.toString();
            }
        } else {
            TLObject e = e(kybVar);
            if (e instanceof TLRPC.User) {
                str2 = m9c.r((TLRPC.User) e);
            } else if (e instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = kybVar.a;
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
        jyb jybVar = this.s;
        if (visibility != 0 && this.y <= 0.0f && jybVar.c.size() > 0) {
            return;
        }
        ArrayList arrayList2 = jybVar.c;
        String str4 = jybVar.d;
        oyb oybVar = jybVar.e;
        long j = oybVar.b;
        int i = oybVar.a;
        String str5 = oybVar.M;
        boolean z5 = oybVar.d;
        if (TextUtils.equals(str4, str5) && oybVar.y > 0.0f && !arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        jybVar.d = oybVar.M;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        if (z5) {
            f = 0.0f;
            z2 = z;
            l = null;
        } else {
            f = 0.0f;
            z2 = z;
            l = oc7.r1(i).g4.l(-j);
        }
        if (!z5) {
            ny0 ny0Var = oybVar.T;
            ArrayList arrayList4 = oybVar.U;
            if (oybVar.g()) {
                f2 = f;
                arrayList = (ArrayList) oc7.r1(i).g4.f.f(-j);
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
            if (oybVar.g()) {
                boolean[] zArr = {false, true};
                for (int i3 = 0; i3 < 2; i3++) {
                    boolean z6 = zArr[i3];
                    ?? obj3 = new Object();
                    obj3.b = Boolean.valueOf(z6);
                    arrayList5.add(obj3);
                }
            }
            if (arrayList5.isEmpty() && oybVar.h()) {
                oybVar.V = 0L;
                str = null;
                oybVar.W = null;
                oybVar.l(false);
            } else {
                str = null;
            }
            ArrayList arrayList7 = new ArrayList(arrayList4);
            arrayList4.clear();
            arrayList4.addAll(arrayList5);
            if (!arrayList7.isEmpty() && !arrayList5.isEmpty() && oybVar.a0 > f2) {
                ia iaVar = new ia(arrayList7, arrayList5);
                z4 = true;
                ww7.a(iaVar, true).c(ny0Var);
            } else {
                z4 = true;
                ny0Var.f();
            }
            oybVar.setTagsShown(arrayList4.isEmpty() ^ z4);
        } else {
            z3 = z5;
            str = null;
        }
        if (TextUtils.isEmpty(oybVar.M) && !oybVar.h()) {
            arrayList2.add(new kyb(oybVar));
        }
        if (z3) {
            ArrayList arrayList8 = oc7.r1(i).E1().j;
            int size2 = arrayList8.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj4 = arrayList8.get(i4);
                i4++;
                kyb kybVar = new kyb(oybVar);
                kybVar.b = (vr9) obj4;
                if (!TextUtils.isEmpty(oybVar.M) && !oybVar.m(kybVar)) {
                    TLObject e = oybVar.e(kybVar);
                    if (e instanceof TLRPC.User) {
                        str3 = m9c.p((TLRPC.User) e);
                    } else if (e instanceof TLRPC.Chat) {
                        str3 = sd2.K((TLRPC.Chat) e, false);
                    } else {
                        str3 = str;
                    }
                    if (str3 != null && str3.toLowerCase().contains(oybVar.M)) {
                    }
                }
                arrayList2.add(kybVar);
            }
            jybVar.E(arrayList3, z2);
        } else {
            boolean z7 = z2;
            HashSet hashSet = new HashSet();
            if (l != null) {
                int size3 = l.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = l.get(i5);
                    i5++;
                    kyb kybVar2 = new kyb(oybVar);
                    kybVar2.a = (TLRPC.TL_forumTopic) obj5;
                    if (!TextUtils.isEmpty(oybVar.M) && !oybVar.m(kybVar2)) {
                        TLObject e2 = oybVar.e(kybVar2);
                        if (e2 instanceof TLRPC.User) {
                            str2 = m9c.p((TLRPC.User) e2);
                        } else if (e2 instanceof TLRPC.Chat) {
                            str2 = sd2.K((TLRPC.Chat) e2, false);
                        } else {
                            str2 = str;
                        }
                        if (str2 != null && str2.toLowerCase().contains(oybVar.M)) {
                        }
                    }
                    if (oybVar.k(kybVar2)) {
                        arrayList2.add(kybVar2);
                        hashSet.add(Long.valueOf(kybVar2.a()));
                    }
                }
            }
            if (oybVar.i()) {
                ArrayList arrayList9 = oybVar.N;
                int size4 = arrayList9.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj6 = arrayList9.get(i6);
                    i6++;
                    kyb kybVar3 = new kyb(oybVar);
                    kybVar3.a = (TLRPC.TL_forumTopic) obj6;
                    if (oybVar.k(kybVar3) && hashSet.add(Long.valueOf(kybVar3.a()))) {
                        arrayList2.add(kybVar3);
                    }
                }
            }
            jybVar.E(arrayList3, z7);
        }
        this.r.post(new cyb(this, (byte) 1));
    }

    public final void o() {
        View view;
        View view2 = this.F;
        if (view2 != null && (view = this.G) != null) {
            r59 r59Var = this.r;
            view2.setAlpha(Utilities.i(r59Var.computeVerticalScrollOffset() / gm.L(16.0f), 1.0f, 0.0f));
            if (this.E != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((r59Var.computeVerticalScrollRange() - r59Var.computeVerticalScrollOffset()) - r59Var.computeVerticalScrollExtent()) / gm.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        nm7.f(i).a(this, nm7.u5);
        nm7.f(i).a(this, 2);
        nm7.f(i).a(this, nm7.i3);
        nm7.e().a(this, nm7.m4);
        if (g()) {
            qwb qwbVar = oc7.r1(i).g4;
            long j = -this.b;
            LongSparseIntArray longSparseIntArray = qwbVar.n;
            long j2 = -j;
            if (!qwbVar.getMessagesController().y2(j2) && longSparseIntArray.get(j, 0) == 0 && System.currentTimeMillis() - qwbVar.h.get(j, 0L) >= 300000) {
                longSparseIntArray.put(j, 1);
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = qwbVar.getMessagesController().i1(j2);
                tL_messages_getForumTopics.limit = 1;
                qwbVar.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new qv2(qwbVar, j, (byte) 7));
            }
        }
        n();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.u5);
        nm7.f(i).n(this, 2);
        nm7.f(i).n(this, nm7.i3);
        nm7.e().n(this, nm7.m4);
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
        WeakHashMap weakHashMap = kfc.a;
        wzc a = dfc.a(this);
        if (a != null) {
            i5 = a.a.f(2).d;
        } else {
            i5 = 0;
        }
        if (i5 != this.H) {
            this.H = i5;
            r59 r59Var = this.r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = gm.L(8.0f) + i5;
                view.getLayoutParams().height = gm.L(64.0f) + i5;
                r59Var.setPadding(0, gm.L(4.0f), 0, gm.L(66.0f) + i5);
            } else {
                view.getLayoutParams().height = gm.L(24.0f) + i5;
                r59Var.setPadding(0, gm.L(4.0f), 0, gm.L(8.0f) + i5);
            }
            this.h.requestLayout();
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        yv1 yv1Var;
        r7 p7;
        a aVar;
        WeakHashMap weakHashMap = kfc.a;
        wzc a = dfc.a(this);
        int i4 = 0;
        if (a != null) {
            i3 = gm.H0(a, false).c;
        } else {
            i3 = 0;
        }
        int i5 = this.I;
        ct8 ct8Var = this.h;
        if (i3 != i5) {
            this.I = i3;
            ct8Var.getLayoutParams().width = getPanelWidth();
            ct8Var.setPadding(0, 0, i3, 0);
            ct8Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i);
        bt1 bt1Var = this.f;
        if (bt1Var != null && (p7 = (yv1Var = bt1Var.a).p7()) != null) {
            aVar = ((d) yv1Var).actionBar;
            i4 = (int) ((aVar.getWidth() - ((p7.getWidth() / 2.0f) + (p7.getX() + ((View) p7.getParent()).getX()))) + gm.L(31.0f));
        }
        int max = Math.max(gm.L(200.0f), Math.min(gm.L(288.0f), (size - this.I) - i4));
        if (max != this.J) {
            this.J = max;
            ct8Var.getLayoutParams().width = getPanelWidth();
            ct8Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyb.onTouchEvent(android.view.MotionEvent):boolean");
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
                ofFloat.addUpdateListener(new ayb(this, (byte) 0));
                this.k0.addListener(new gyb(this, (byte) 1));
                this.k0.setDuration(320L);
                this.k0.setInterpolator(d53.h);
                this.k0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        if (this.y <= 0.0f && !this.c0) {
            i = 8;
        }
        setVisibility(i);
        invalidate();
        bt1 bt1Var = this.f;
        if (bt1Var != null) {
            bt1Var.a.m1.invalidate();
        }
    }

    public void settle(float f) {
        boolean z = false;
        float f2 = 0.0f;
        if (Math.abs(f) <= gm.L(300.0f) ? this.y > 0.5f : f < 0.0f) {
            z = true;
        }
        if (z) {
            n();
            f2 = 1.0f;
        }
        a(f2, f);
        if (!z) {
            gm.t1(this.w);
        }
    }
}
