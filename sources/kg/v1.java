package kg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i5;
import org.telegram.messenger.k6;
import org.telegram.messenger.o5;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.eu0;
import org.telegram.ui.st0;
import org.telegram.ui.u71;
import w7.b6;
public class v1 extends ha implements us {
    public ValueAnimator A2;
    public boolean B2;
    public boolean C2;
    public FrameLayout D2;
    public final FrameLayout E2;
    public FrameLayout F2;
    public p80[] G2;
    public p80 H2;
    public final ArrayList P1;
    public int Q1;
    public final TLRPC.User R1;
    public final m S1;
    public final TL_stars.StarGift T1;
    public boolean U1;
    public final st0 V1;
    public int W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int a2;
    public int f11293b2;
    public int f11294c2;
    public int f11295d2;
    public int f11296e2;
    public int f11297f2;
    public final xz f11298g2;
    public final k1 f11299h2;
    public g f11300i2;
    public h f11301j2;
    public u71 f11302k2;
    public final org.telegram.ui.ActionBar.k2 f11303l2;
    public Integer f11304m2;
    public float f11305n2;
    public float f11306o2;
    public float f11307p2;
    public float f11308q2;
    public float f11309r2;
    public View f11310s2;
    public View f11311t2;
    public TLRPC.InputStickerSet f11312u2;
    public TLRPC.TL_emojiStatusCollectible f11313v2;
    public boolean f11314w2;
    public final int[] f11315x2;
    public float f11316y2;
    public boolean f11317z2;

    public v1(org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, p6 p6Var) {
        this(k2Var, i10, user, null, null, p6Var);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        return new f(this, 1);
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131744256, null);
    }

    @Override
    public final void S0(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.P1;
            if (i12 < arrayList.size()) {
                st0 st0Var = this.V1;
                st0Var.a((eu0) arrayList.get(i12), false);
                st0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((eu0) arrayList.get(i12)).e = i13;
                i13 += st0Var.getMeasuredHeight();
                i12++;
            } else {
                this.W1 = i13;
                this.f21589c.getLocationOnScreen(this.f11315x2);
                return;
            }
        }
    }

    @Override
    public final void U0(uu0 uu0Var) {
        this.Q1 = d20.f15147s0;
        x0 x0Var = new x0(getContext(), this.I0, false);
        x0Var.b(PremiumPreviewFragment.s0(this.Q1, null), new ag.g(this, 12), false);
        this.D2 = new FrameLayout(getContext());
        View view = new View(getContext());
        a7.i(t6.f20930d7, view, this.I0);
        this.D2.addView(view, b6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.i0.Y3(view, true, 1.0f, true, false);
        if (!d20.i(this.Q1).q() && !(this instanceof mg.f1)) {
            this.D2.addView(x0Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            a7.i(t6.f21001h5, this.D2, this.I0);
            uu0Var.addView(this.D2, b6.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i10;
        View view2 = this.f11311t2;
        if (view2 != null) {
            if (this.f11317z2) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view2.setVisibility(i10);
        }
        if (this.f11310s2 != null && this.f11317z2) {
            View view3 = this.f11311t2;
            if (view3 == null) {
                view = this.f11301j2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f11305n2, this.f11306o2};
            this.f11310s2.getMatrix().mapPoints(fArr);
            View view4 = this.f11310s2;
            if (view4 instanceof u5) {
                drawable = ((u5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.q1) {
                drawable = ((org.telegram.ui.Cells.q1) view4).f22672oa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.f11315x2;
            float f7 = (-iArr[0]) + this.f11307p2 + fArr[0];
            float f10 = (-iArr[1]) + this.f11308q2 + fArr[1];
            if (org.telegram.messenger.i0.Q1()) {
                ViewGroup view5 = this.f11303l2.getParentLayout().getView();
                f7 += view5.getX() + view5.getPaddingLeft();
                f10 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f11309r2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f11 = measuredHeight / intrinsicWidth;
            float f12 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f21589c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.i0.T1(f7, measuredWidth, gr.h.getInterpolation(this.f11316y2));
            float T12 = org.telegram.messenger.i0.T1(f10, measuredHeight2, this.f11316y2);
            float f13 = this.f11309r2;
            float f14 = this.f11316y2;
            float f15 = (f11 * f14) + ((1.0f - f14) * f13);
            canvas.save();
            canvas.scale(f15, f15, T1, T12);
            int i11 = (int) T1;
            int i12 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, i11, drawable), org.telegram.ui.Cells.f1.y(2, i12, drawable), org.telegram.ui.Cells.f1.w(2, i11, drawable), org.telegram.ui.Cells.f1.f(2, i12, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.f11316y2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.i0.T1(f12, 1.0f, this.f11316y2);
            canvas.scale(T13, T13, T1, T12);
            canvas.translate(T1 - (view.getMeasuredWidth() / 2.0f), T12 - (view.getMeasuredHeight() / 2.0f));
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == zs.B0 && (inputStickerSet = this.f11312u2) != null && inputStickerSet.f19813id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zs.e().k(zs.f19639k1, 4);
        ValueAnimator valueAnimator = this.A2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        xz xzVar = this.f11298g2;
        if (xzVar.f32571c) {
            xzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(u71 u71Var) {
        u71Var.addView(this.f11311t2, b6.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i10) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.f11304m2;
        if (num == null) {
            return org.telegram.messenger.i0.P2(str, t6.f21242u6, this.I0, null, false);
        }
        return org.telegram.messenger.i0.N2(str, num.intValue(), null);
    }

    public void j1(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        p80[] p80VarArr = this.G2;
        if (p80VarArr != null && this.H2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f11313v2;
            TLRPC.User user = this.R1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.G2[0].setText(org.telegram.messenger.i0.T2(cd.a0(null, null, 2131744244, o5.u(user), str2), new m1(this, 0)));
                this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744242, null)));
            } else if (this.f11312u2 != null) {
                CharSequence i12 = i1(cd.a0(null, null, 2131744241, i5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    i12 = k6.m(i12, this.G2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (i12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) i12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(i12);
                }
                int indexOf = i12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet m0 = ui.b0(this.Q1).m0(this.f11312u2, false);
                    if (m0 != null && !m0.documents.isEmpty()) {
                        document = m0.documents.get(0);
                        if (m0.set != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= m0.documents.size()) {
                                    break;
                                } else if (m0.documents.get(i10).f19799id == m0.set.thumb_document_id) {
                                    document = m0.documents.get(i10);
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o5(document, this.G2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (m0 != null && m0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) m0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new u80(org.telegram.messenger.i0.L(100.0f), this.G2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new dh.a(this, 2), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.G2[1].setOnLinkPressListener(new o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            v1 v1Var = v1.this;
                            arrayList.add(v1Var.f11312u2);
                            q1 q1Var = new q1(v1Var, 0);
                            org.telegram.ui.ActionBar.k2 k2Var = v1Var.f11303l2;
                            if (k2Var != null) {
                                q1Var.setParentFragment(k2Var);
                            }
                            new r1(v1Var, q1Var, v1Var.getContext(), v1Var.I0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        p80[] p80VarArr2 = this.G2;
                        if (p80VarArr2 != null) {
                            p80VarArr2[1].setText(spannableStringBuilder);
                            if (this.G2[1].getVisibility() != 0) {
                                if (z10) {
                                    this.G2[1].setAlpha(0.0f);
                                    this.G2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.G2[1].animate().alpha(1.0f);
                                    gr grVar = gr.f26495f;
                                    z20.m(alpha, grVar, 200L);
                                    this.G2[0].animate().alpha(0.0f).setInterpolator(grVar).setDuration(200L).withEndAction(new m1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new p1(this, 1));
                                    ofFloat.setInterpolator(grVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.G2[1].setAlpha(1.0f);
                                    this.G2[1].setVisibility(0);
                                    this.G2[0].setAlpha(0.0f);
                                    this.G2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.G2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744242, null)));
            } else if (this.f11314w2) {
                p80VarArr[0].setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744243, i5.m(0, user.first_name, user.last_name))));
                this.H2.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744242, i5.m(0, user.first_name, user.last_name))));
            } else {
                m mVar = this.S1;
                if (mVar != null) {
                    if (this.U1) {
                        p80 p80Var = p80VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        p80Var.setText(i1(cd.a0(null, null, 2131744245, str, cd.G(mVar.d(), "GiftMonths", new Object[0]))));
                        p80 p80Var2 = this.H2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        p80Var2.setText(i1(cd.a0(null, null, 2131744246, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f19942id != 777000) {
                        this.G2[0].setText(i1(cd.a0(null, null, 2131744248, user.first_name, cd.G(mVar.d(), "GiftMonths", new Object[0]))));
                        this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744249, null)));
                    } else {
                        this.G2[0].setText(i1(cd.a0(null, null, 2131744247, cd.G(mVar.d(), "GiftMonths", new Object[0]))));
                        this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744249, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.T1;
                    if (starGift != null) {
                        p80VarArr[0].setText(cd.L0(2131750077, null));
                        this.G2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.H2.setText(org.telegram.messenger.i0.W2(cd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131750081, null)));
                        }
                        this.H2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        p80VarArr[0].setText(cd.L0(2131744256, null));
                        this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744254, null)));
                    } else {
                        p80VarArr[0].setText(i1(cd.a0(null, null, 2131744250, i5.m(0, user.first_name, user.last_name))));
                        this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744251, null)));
                    }
                }
            }
            try {
                p80 p80Var3 = this.G2[0];
                p80Var3.setText(k6.m(p80Var3.getText(), this.G2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void k1() {
        int i10 = this.X1;
        int i11 = i10 + 1;
        this.X1 = i11;
        this.Y1 = i10;
        this.f11293b2 = i11;
        int size = this.P1.size() + i11;
        this.f11294c2 = size;
        this.X1 = size + 1;
        this.f11295d2 = size;
        if (!d20.i(this.Q1).q() && this.S1 == null) {
            int i12 = this.X1;
            this.X1 = i12 + 1;
            this.f11296e2 = i12;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f11310s2 == null) {
            return false;
        }
        this.A2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11316y2 = 0.0f;
        this.f11317z2 = true;
        this.f11302k2.invalidate();
        View view = this.f11310s2;
        if (view instanceof u5) {
            drawable = ((u5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            d5 d5Var = q1Var.f22672oa;
            q1Var.n2();
            drawable = d5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f11310s2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).n2();
        } else {
            view2.invalidate();
        }
        h hVar = this.f11301j2;
        if (hVar != null) {
            hVar.m(100L);
        }
        this.A2.addUpdateListener(new p1(this, 0));
        this.A2.addListener(new bg.f(6, this, drawable));
        this.A2.setDuration(600L);
        this.A2.setInterpolator(gr.h);
        this.A2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(d20.f15147s0).c(this, zs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(d20.f15147s0).n(this, zs.B0);
    }

    @Override
    public final void show() {
        super.show();
        zs.e().k(zs.f19633j1, 4);
        if (this.B2) {
            org.telegram.messenger.i0.h3(new m1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        h hVar = this.f11301j2;
        if (hVar != null) {
            hVar.setDialogVisible(true);
        }
        this.f11300i2.setPaused(true);
        dialog.setOnDismissListener(new ag.x(this, 5));
        dialog.show();
        return true;
    }

    public v1(org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, m mVar, TL_stars.StarGift starGift, p6 p6Var) {
        super(k2Var, false, false, p6Var);
        ArrayList arrayList = new ArrayList();
        this.P1 = arrayList;
        this.f11315x2 = new int[2];
        this.f11316y2 = 0.0f;
        O();
        this.f11303l2 = k2Var;
        this.f26672r1 = 0.26f;
        this.R1 = user;
        this.Q1 = i10;
        this.S1 = mVar;
        this.T1 = starGift;
        this.V1 = new st0(getContext(), null);
        PremiumPreviewFragment.r0(i10, arrayList);
        if (mVar != null || d20.i(i10).q()) {
            this.D2.setVisibility(8);
        }
        k1 k1Var = new k1(t6.zk, t6.Ak, t6.Bk, t6.Ck, null);
        this.f11299h2 = k1Var;
        k1Var.f11148m = true;
        k1Var.f11150o = 1.0f;
        k1Var.f11151p = 0.0f;
        k1Var.f11152q = 0.0f;
        k1Var.f11140b = 0.0f;
        k1Var.f11141c = 0.0f;
        k1();
        this.f26666k1.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        this.f26666k1.setOnItemClickListener(new o1(this, i10, k2Var, 0));
        ui.b0(i10).o1();
        PremiumPreviewFragment.v0("profile");
        xz xzVar = new xz(getContext());
        this.f11298g2 = xzVar;
        this.f21589c.addView(xzVar, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.E2 = frameLayout;
        this.f21586b.addView(frameLayout, b6.e(-1, 140, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i10, View view) {
    }
}
