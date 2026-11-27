package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public class kl8 extends ny0 implements fn7 {
    public final int[] A2;
    public float B2;
    public boolean C2;
    public ValueAnimator D2;
    public boolean E2;
    public boolean F2;
    public FrameLayout G2;
    public final FrameLayout H2;
    public FrameLayout I2;
    public p66[] J2;
    public p66 K2;
    public final ArrayList S1;
    public int T1;
    public final TLRPC.User U1;
    public final pw4 V1;
    public final TL_stars.StarGift W1;
    public boolean X1;
    public final yk8 Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public final tj4 j2;
    public final al8 k2;
    public vb l2;
    public i94 m2;
    public oob n2;
    public final e o2;
    public Integer p2;
    public float q2;
    public float r2;
    public float s2;
    public float t2;
    public float u2;
    public View v2;
    public View w2;
    public TLRPC.InputStickerSet x2;
    public TLRPC.TL_emojiStatusCollectible y2;
    public boolean z2;

    public kl8(e eVar, int i, TLRPC.User user, pw4 pw4Var, TL_stars.StarGift starGift, vnb vnbVar) {
        super(eVar, false, false, vnbVar);
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        this.A2 = new int[2];
        this.B2 = 0.0f;
        J();
        this.o2 = eVar;
        this.u1 = 0.26f;
        this.U1 = user;
        this.T1 = i;
        this.V1 = pw4Var;
        this.W1 = starGift;
        this.Y1 = new yk8(getContext(), null);
        PremiumPreviewFragment.q0(i, arrayList);
        if (pw4Var != null || yac.h(i).p()) {
            this.G2.setVisibility(8);
        }
        al8 al8Var = new al8(aob.Ck, aob.Dk, aob.Ek, aob.Fk, null);
        this.k2 = al8Var;
        al8Var.m = true;
        al8Var.o = 1.0f;
        al8Var.p = 0.0f;
        al8Var.q = 0.0f;
        al8Var.b = 0.0f;
        al8Var.c = 0.0f;
        g1();
        this.n1.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
        this.n1.setOnItemClickListener(new fl8(this, i, eVar, (byte) 0));
        ls6.d0(i).p1();
        PremiumPreviewFragment.w0("profile");
        tj4 tj4Var = new tj4(getContext());
        this.j2 = tj4Var;
        this.c.addView(tj4Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.H2 = frameLayout;
        this.b.addView(frameLayout, tre.e(-1, 140, 87));
    }

    @Override
    public final void O0(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.S1;
            if (i3 < arrayList.size()) {
                yk8 yk8Var = this.Y1;
                yk8Var.a((sl8) arrayList.get(i3), false);
                yk8Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((sl8) arrayList.get(i3)).e = i4;
                i4 += yk8Var.getMeasuredHeight();
                i3++;
            } else {
                this.Z1 = i4;
                this.c.getLocationOnScreen(this.A2);
                return;
            }
        }
    }

    @Override
    public final void Q0(wma wmaVar) {
        this.T1 = yac.t0;
        ok8 ok8Var = new ok8(this.J0, getContext(), false);
        ok8Var.b(PremiumPreviewFragment.r0(this.T1, null), new am7(this, (byte) 25), false);
        this.G2 = new FrameLayout(getContext());
        View view = new View(getContext());
        yob.h(aob.d7, this.J0, view);
        this.G2.addView(view, tre.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        hl.T3(view, true, 1.0f, true, false);
        if (!yac.h(this.T1).p() && !(this instanceof zl8)) {
            this.G2.addView(ok8Var, tre.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            yob.h(aob.h5, this.J0, this.G2);
            wmaVar.addView(this.G2, tre.e(-1, 68, 80));
        }
    }

    @Override
    public final void W(Canvas canvas) {
        View view;
        Drawable drawable;
        int i;
        View view2 = this.w2;
        if (view2 != null) {
            if (this.C2) {
                i = 4;
            } else {
                i = 0;
            }
            view2.setVisibility(i);
        }
        if (this.v2 != null && this.C2) {
            View view3 = this.w2;
            if (view3 == null) {
                view = this.m2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.q2, this.r2};
            this.v2.getMatrix().mapPoints(fArr);
            View view4 = this.v2;
            if (view4 instanceof ema) {
                drawable = ((ema) view4).getRightDrawable();
            } else if (view4 instanceof wb2) {
                drawable = ((wb2) view4).Ca;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.A2;
            float f = (-iArr[0]) + this.s2 + fArr[0];
            float f2 = (-iArr[1]) + this.t2 + fArr[1];
            if (hl.O1()) {
                ViewGroup view5 = this.o2.getParentLayout().getView();
                f += view5.getX() + view5.getPaddingLeft();
                f2 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.u2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f3 = measuredHeight / intrinsicWidth;
            float f4 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float R1 = hl.R1(f, measuredWidth, k43.h.getInterpolation(this.B2));
            float R12 = hl.R1(f2, measuredHeight2, this.B2);
            float f5 = this.u2;
            float f6 = this.B2;
            float f7 = (f3 * f6) + ((1.0f - f6) * f5);
            canvas.save();
            canvas.scale(f7, f7, R1, R12);
            int i2 = (int) R1;
            int i3 = (int) R12;
            drawable.setBounds(bp1.A(2, i2, drawable), bp1.y(2, i3, drawable), bp1.w(2, i2, drawable), bp1.i(2, i3, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.B2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float R13 = hl.R1(f4, 1.0f, this.B2);
            canvas.scale(R13, R13, R1, R12);
            uh9.n(view.getMeasuredHeight(), 2.0f, R12, R1 - (view.getMeasuredWidth() / 2.0f), canvas);
            view.draw(canvas);
            canvas.restore();
        }
    }

    public void a1(oob oobVar) {
        oobVar.addView(this.w2, tre.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int b1() {
        return 0;
    }

    public View d1(Context context, int i) {
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i == jn7.B0 && (inputStickerSet = this.x2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            f1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        jn7.e().k(jn7.k1, 4);
        ValueAnimator valueAnimator = this.D2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        tj4 tj4Var = this.j2;
        if (tj4Var.c) {
            tj4Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public final SpannableStringBuilder e1(String str) {
        Integer num = this.p2;
        if (num == null) {
            return hl.M2(str, aob.u6, this.J0, null, false);
        }
        return hl.K2(str, num.intValue(), null);
    }

    public void f1(boolean z) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        p66[] p66VarArr = this.J2;
        if (p66VarArr != null && this.K2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.y2;
            TLRPC.User user = this.U1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.J2[0].setText(hl.N2(ob6.a0(null, null, 2131743872, wf3.t(user), str2), -1, 0, new el8(this, (byte) 0), null));
                this.K2.setText(hl.S2(ob6.M0(2131743870, null)));
            } else if (this.x2 != null) {
                CharSequence e1 = e1(ob6.a0(null, null, 2131743869, lv2.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    e1 = pv3.m(e1, this.J2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (e1 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) e1;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(e1);
                }
                int indexOf = e1.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet n0 = ls6.d0(this.T1).n0(this.x2, false);
                    if (n0 != null && !n0.documents.isEmpty()) {
                        document = n0.documents.get(0);
                        if (n0.set != null) {
                            int i = 0;
                            while (true) {
                                if (i >= n0.documents.size()) {
                                    break;
                                } else if (n0.documents.get(i).id == n0.set.thumb_document_id) {
                                    document = n0.documents.get(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new hm(document, this.J2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (n0 != null && n0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) n0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new ya6(hl.L(100.0f), this.J2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new a31(this, (byte) 9), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.J2[1].setOnLinkPressListener(new r94(this, (byte) 1));
                    p66[] p66VarArr2 = this.J2;
                    if (document != null) {
                        if (p66VarArr2 != null) {
                            p66VarArr2[1].setText(spannableStringBuilder);
                            if (this.J2[1].getVisibility() != 0) {
                                p66[] p66VarArr3 = this.J2;
                                if (z) {
                                    p66VarArr3[1].setAlpha(0.0f);
                                    this.J2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.J2[1].animate().alpha(1.0f);
                                    k43 k43Var = k43.f;
                                    ik8.t(alpha, k43Var, 200L);
                                    this.J2[0].animate().alpha(0.0f).setInterpolator(k43Var).setDuration(200L).withEndAction(new el8(this, (byte) 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new gl8(this, (byte) 0));
                                    ofFloat.setInterpolator(k43Var);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    p66VarArr3[1].setAlpha(1.0f);
                                    this.J2[1].setVisibility(0);
                                    this.J2[0].setAlpha(0.0f);
                                    this.J2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        p66VarArr2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.K2.setText(hl.S2(ob6.M0(2131743870, null)));
            } else if (this.z2) {
                p66VarArr[0].setText(hl.S2(ob6.a0(null, null, 2131743871, lv2.m(0, user.first_name, user.last_name))));
                this.K2.setText(hl.S2(ob6.a0(null, null, 2131743870, lv2.m(0, user.first_name, user.last_name))));
            } else {
                pw4 pw4Var = this.V1;
                if (pw4Var != null) {
                    if (this.X1) {
                        p66 p66Var = p66VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        p66Var.setText(e1(ob6.a0(null, null, 2131743873, str, ob6.G(pw4Var.d(), "GiftMonths", new Object[0]))));
                        p66 p66Var2 = this.K2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        p66Var2.setText(e1(ob6.a0(null, null, 2131743874, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.id != 777000) {
                        this.J2[0].setText(e1(ob6.a0(null, null, 2131743876, user.first_name, ob6.G(pw4Var.d(), "GiftMonths", new Object[0]))));
                        this.K2.setText(hl.S2(ob6.M0(2131743877, null)));
                    } else {
                        this.J2[0].setText(e1(ob6.a0(null, null, 2131743875, ob6.G(pw4Var.d(), "GiftMonths", new Object[0]))));
                        this.K2.setText(hl.S2(ob6.M0(2131743877, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.W1;
                    if (starGift != null) {
                        p66VarArr[0].setText(ob6.M0(2131750026, null));
                        this.J2[0].setTextSize(1, 20.0f);
                        boolean z2 = starGift.limited_per_user;
                        p66 p66Var3 = this.K2;
                        if (z2) {
                            p66Var3.setText(hl.S2(ob6.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            p66Var3.setText(hl.S2(ob6.M0(2131750030, null)));
                        }
                        this.K2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        p66VarArr[0].setText(ob6.M0(2131743884, null));
                        this.K2.setText(hl.S2(ob6.M0(2131743882, null)));
                    } else {
                        p66VarArr[0].setText(e1(ob6.a0(null, null, 2131743878, lv2.m(0, user.first_name, user.last_name))));
                        this.K2.setText(hl.S2(ob6.M0(2131743879, null)));
                    }
                }
            }
            try {
                p66 p66Var4 = this.J2[0];
                p66Var4.setText(pv3.m(p66Var4.getText(), this.J2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void g1() {
        int i = this.a2;
        int i2 = i + 1;
        this.a2 = i2;
        this.b2 = i;
        this.e2 = i2;
        int size = this.S1.size() + i2;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
        if (!yac.h(this.T1).p() && this.V1 == null) {
            int i3 = this.a2;
            this.a2 = i3 + 1;
            this.h2 = i3;
        }
    }

    @Override
    public final boolean j0() {
        Drawable drawable;
        if (this.v2 == null) {
            return false;
        }
        this.D2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B2 = 0.0f;
        this.C2 = true;
        this.n2.invalidate();
        View view = this.v2;
        if (view instanceof ema) {
            drawable = ((ema) view).getRightDrawable();
        } else if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            ul ulVar = wb2Var.Ca;
            wb2Var.r2();
            drawable = ulVar;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.v2;
        if (view2 instanceof wb2) {
            ((wb2) view2).r2();
        } else {
            view2.invalidate();
        }
        i94 i94Var = this.m2;
        if (i94Var != null) {
            i94Var.m(100L);
        }
        this.D2.addUpdateListener(new gl8(this, (byte) 1));
        this.D2.addListener(new wd8(this, drawable, (byte) 2));
        this.D2.setDuration(600L);
        this.D2.setInterpolator(k43.h);
        this.D2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(yac.t0).b(this, jn7.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(yac.t0).n(this, jn7.B0);
    }

    @Override
    public final void show() {
        super.show();
        jn7.e().k(jn7.j1, 4);
        if (this.E2) {
            hl.d3(new el8(this, (byte) 1), 200L);
        }
    }

    @Override
    public final boolean u(Dialog dialog) {
        i94 i94Var = this.m2;
        if (i94Var != null) {
            i94Var.setDialogVisible(true);
        }
        this.l2.setPaused(true);
        dialog.setOnDismissListener(new dl8(this, (byte) 0));
        dialog.show();
        return true;
    }

    public void c1(View view) {
    }

    public void Z0(int i, View view) {
    }

    public kl8(e eVar, int i, TLRPC.User user, vnb vnbVar) {
        this(eVar, i, user, null, null, vnbVar);
    }
}
