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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public class xh8 extends fy0 implements gk7 {
    public final int[] A2;
    public float B2;
    public boolean C2;
    public ValueAnimator D2;
    public boolean E2;
    public boolean F2;
    public FrameLayout G2;
    public final FrameLayout H2;
    public FrameLayout I2;
    public l46[] J2;
    public l46 K2;
    public final ArrayList S1;
    public int T1;
    public final TLRPC.User U1;
    public final mu4 V1;
    public final TL_stars.StarGift W1;
    public boolean X1;
    public final kh8 Y1;
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
    public final qh4 j2;
    public final mh8 k2;
    public ub l2;
    public n84 m2;
    public pkb n2;
    public final d o2;
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

    public xh8(d dVar, int i, TLRPC.User user, mu4 mu4Var, TL_stars.StarGift starGift, wjb wjbVar) {
        super(dVar, false, false, wjbVar);
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        this.A2 = new int[2];
        this.B2 = 0.0f;
        K();
        this.o2 = dVar;
        this.u1 = 0.26f;
        this.U1 = user;
        this.T1 = i;
        this.V1 = mu4Var;
        this.W1 = starGift;
        this.Y1 = new kh8(getContext(), null);
        PremiumPreviewFragment.q0(i, arrayList);
        if (mu4Var != null || y6c.h(i).p()) {
            this.G2.setVisibility(8);
        }
        mh8 mh8Var = new mh8(bkb.Bk, bkb.Ck, bkb.Dk, bkb.Ek, null);
        this.k2 = mh8Var;
        mh8Var.m = true;
        mh8Var.o = 1.0f;
        mh8Var.p = 0.0f;
        mh8Var.q = 0.0f;
        mh8Var.b = 0.0f;
        mh8Var.c = 0.0f;
        f1();
        this.n1.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
        this.n1.setOnItemClickListener(new sh8(this, i, dVar, (byte) 0));
        hq6.d0(i).p1();
        PremiumPreviewFragment.v0("profile");
        qh4 qh4Var = new qh4(getContext());
        this.j2 = qh4Var;
        this.c.addView(qh4Var, nme.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.H2 = frameLayout;
        this.b.addView(frameLayout, nme.e(-1, 140, 87));
    }

    @Override
    public final void N0(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.S1;
            if (i3 < arrayList.size()) {
                kh8 kh8Var = this.Y1;
                kh8Var.a((fi8) arrayList.get(i3), false);
                kh8Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((fi8) arrayList.get(i3)).e = i4;
                i4 += kh8Var.getMeasuredHeight();
                i3++;
            } else {
                this.Z1 = i4;
                this.c.getLocationOnScreen(this.A2);
                return;
            }
        }
    }

    @Override
    public final void P0(cja cjaVar) {
        this.T1 = y6c.t0;
        ah8 ah8Var = new ah8(this.J0, getContext(), false);
        ah8Var.b(PremiumPreviewFragment.r0(this.T1, null), new fr7(this, (byte) 23), false);
        this.G2 = new FrameLayout(getContext());
        View view = new View(getContext());
        zkb.h(bkb.c7, this.J0, view);
        this.G2.addView(view, nme.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        gl.U3(view, true, 1.0f, true, false);
        if (!y6c.h(this.T1).p() && !(this instanceof mi8)) {
            this.G2.addView(ah8Var, nme.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            zkb.h(bkb.g5, this.J0, this.G2);
            cjaVar.addView(this.G2, nme.e(-1, 68, 80));
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
            if (view4 instanceof jia) {
                drawable = ((jia) view4).getRightDrawable();
            } else if (view4 instanceof gb2) {
                drawable = ((gb2) view4).Ca;
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
            if (gl.O1()) {
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
            float R1 = gl.R1(f, measuredWidth, s33.h.getInterpolation(this.B2));
            float R12 = gl.R1(f2, measuredHeight2, this.B2);
            float f5 = this.u2;
            float f6 = this.B2;
            float f7 = (f3 * f6) + ((1.0f - f6) * f5);
            canvas.save();
            canvas.scale(f7, f7, R1, R12);
            int i2 = (int) R1;
            int i3 = (int) R12;
            drawable.setBounds(oo1.A(2, i2, drawable), oo1.y(2, i3, drawable), oo1.w(2, i2, drawable), oo1.i(2, i3, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.B2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float R13 = gl.R1(f4, 1.0f, this.B2);
            canvas.scale(R13, R13, R1, R12);
            de9.n(view.getMeasuredHeight(), 2.0f, R12, R1 - (view.getMeasuredWidth() / 2.0f), canvas);
            view.draw(canvas);
            canvas.restore();
        }
    }

    public void Z0(pkb pkbVar) {
        pkbVar.addView(this.w2, nme.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int a1() {
        return 0;
    }

    public View c1(Context context, int i) {
        return null;
    }

    public final SpannableStringBuilder d1(String str) {
        Integer num = this.p2;
        if (num == null) {
            return gl.N2(str, bkb.t6, this.J0, null, false);
        }
        return gl.L2(str, num.intValue(), null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i == kk7.A0 && (inputStickerSet = this.x2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            e1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.e().k(kk7.j1, 4);
        ValueAnimator valueAnimator = this.D2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qh4 qh4Var = this.j2;
        if (qh4Var.c) {
            qh4Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(boolean z) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        l46[] l46VarArr = this.J2;
        if (l46VarArr != null && this.K2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.y2;
            TLRPC.User user = this.U1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.J2[0].setText(gl.O2(k96.a0(null, null, 2131743978, cf3.t(user), str2), -1, 0, new qh8(this, (byte) 0), null));
                this.K2.setText(gl.T2(k96.M0(2131743976, null)));
            } else if (this.x2 != null) {
                CharSequence d1 = d1(k96.a0(null, null, 2131743975, qu2.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    d1 = vu3.m(d1, this.J2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (d1 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) d1;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(d1);
                }
                int indexOf = d1.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet n0 = hq6.d0(this.T1).n0(this.x2, false);
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
                        spannableStringBuilder2.setSpan(new gm(document, this.J2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (n0 != null && n0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) n0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new u86(gl.L(100.0f), this.J2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new r21(this, (byte) 9), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.J2[1].setOnLinkPressListener(new rh8(this, (byte) 0));
                    l46[] l46VarArr2 = this.J2;
                    if (document != null) {
                        if (l46VarArr2 != null) {
                            l46VarArr2[1].setText(spannableStringBuilder);
                            if (this.J2[1].getVisibility() != 0) {
                                l46[] l46VarArr3 = this.J2;
                                if (z) {
                                    l46VarArr3[1].setAlpha(0.0f);
                                    this.J2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.J2[1].animate().alpha(1.0f);
                                    s33 s33Var = s33.f;
                                    ug8.t(alpha, s33Var, 200L);
                                    this.J2[0].animate().alpha(0.0f).setInterpolator(s33Var).setDuration(200L).withEndAction(new qh8(this, (byte) 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new th8(this, (byte) 1));
                                    ofFloat.setInterpolator(s33Var);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    l46VarArr3[1].setAlpha(1.0f);
                                    this.J2[1].setVisibility(0);
                                    this.J2[0].setAlpha(0.0f);
                                    this.J2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        l46VarArr2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.K2.setText(gl.T2(k96.M0(2131743976, null)));
            } else if (this.z2) {
                l46VarArr[0].setText(gl.T2(k96.a0(null, null, 2131743977, qu2.m(0, user.first_name, user.last_name))));
                this.K2.setText(gl.T2(k96.a0(null, null, 2131743976, qu2.m(0, user.first_name, user.last_name))));
            } else {
                mu4 mu4Var = this.V1;
                if (mu4Var != null) {
                    if (this.X1) {
                        l46 l46Var = l46VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        l46Var.setText(d1(k96.a0(null, null, 2131743979, str, k96.G(mu4Var.d(), "GiftMonths", new Object[0]))));
                        l46 l46Var2 = this.K2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        l46Var2.setText(d1(k96.a0(null, null, 2131743980, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.id != 777000) {
                        this.J2[0].setText(d1(k96.a0(null, null, 2131743982, user.first_name, k96.G(mu4Var.d(), "GiftMonths", new Object[0]))));
                        this.K2.setText(gl.T2(k96.M0(2131743983, null)));
                    } else {
                        this.J2[0].setText(d1(k96.a0(null, null, 2131743981, k96.G(mu4Var.d(), "GiftMonths", new Object[0]))));
                        this.K2.setText(gl.T2(k96.M0(2131743983, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.W1;
                    if (starGift != null) {
                        l46VarArr[0].setText(k96.M0(2131750052, null));
                        this.J2[0].setTextSize(1, 20.0f);
                        boolean z2 = starGift.limited_per_user;
                        l46 l46Var3 = this.K2;
                        if (z2) {
                            l46Var3.setText(gl.T2(k96.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            l46Var3.setText(gl.T2(k96.M0(2131750056, null)));
                        }
                        this.K2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        l46VarArr[0].setText(k96.M0(2131743990, null));
                        this.K2.setText(gl.T2(k96.M0(2131743988, null)));
                    } else {
                        l46VarArr[0].setText(d1(k96.a0(null, null, 2131743984, qu2.m(0, user.first_name, user.last_name))));
                        this.K2.setText(gl.T2(k96.M0(2131743985, null)));
                    }
                }
            }
            try {
                l46 l46Var4 = this.J2[0];
                l46Var4.setText(vu3.m(l46Var4.getText(), this.J2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void f1() {
        int i = this.a2;
        int i2 = i + 1;
        this.a2 = i2;
        this.b2 = i;
        this.e2 = i2;
        int size = this.S1.size() + i2;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
        if (!y6c.h(this.T1).p() && this.V1 == null) {
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
        if (view instanceof jia) {
            drawable = ((jia) view).getRightDrawable();
        } else if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            tl tlVar = gb2Var.Ca;
            gb2Var.r2();
            drawable = tlVar;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.v2;
        if (view2 instanceof gb2) {
            ((gb2) view2).r2();
        } else {
            view2.invalidate();
        }
        n84 n84Var = this.m2;
        if (n84Var != null) {
            n84Var.m(100L);
        }
        this.D2.addUpdateListener(new th8(this, (byte) 0));
        this.D2.addListener(new eh8(this, drawable, (byte) 1));
        this.D2.setDuration(600L);
        this.D2.setInterpolator(s33.h);
        this.D2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(y6c.t0).b(this, kk7.A0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(y6c.t0).n(this, kk7.A0);
    }

    @Override
    public final void show() {
        super.show();
        kk7.e().k(kk7.i1, 4);
        if (this.E2) {
            gl.e3(new qh8(this, (byte) 1), 200L);
        }
    }

    @Override
    public final boolean u(Dialog dialog) {
        n84 n84Var = this.m2;
        if (n84Var != null) {
            n84Var.setDialogVisible(true);
        }
        this.l2.setPaused(true);
        dialog.setOnDismissListener(new ph8(this, (byte) 0));
        dialog.show();
        return true;
    }

    public void b1(View view) {
    }

    public void Y0(int i, View view) {
    }

    public xh8(d dVar, int i, TLRPC.User user, wjb wjbVar) {
        this(dVar, i, user, null, null, wjbVar);
    }
}
