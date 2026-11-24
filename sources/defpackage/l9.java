package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class l9 extends FrameLayout implements it4, tjb {
    public final int a;
    public final hn b;
    public final hn c;
    public final k9 d;
    public ArrayList e;
    public boolean f;

    public l9(Activity activity, int i) {
        super(activity);
        this.e = new ArrayList();
        this.a = i;
        LinearLayout m = ir2.m(activity, 1);
        hn hnVar = new hn(activity, false, false, false);
        this.b = hnVar;
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        hnVar.setTranslationY(-gl.L(1.0f));
        m.addView(hnVar, nme.o(-1, 18));
        hn hnVar2 = new hn(activity, false, false, false);
        this.c = hnVar2;
        hnVar2.setTextSize(gl.L(13.0f));
        m.addView(hnVar2, nme.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        k9 k9Var = new k9(activity, i);
        this.d = k9Var;
        k9Var.b(299L);
        addView(m, nme.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(k9Var, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable L0 = bkb.L0(false);
        vkb M = zkb.M(bkb.h6);
        setBackground(L0);
        zkb.j(this, L0, null, M, null);
        updateColors();
        setOnClickListener(new j1(this, (byte) 4));
    }

    @Override
    public final void c(ArrayList arrayList) {
        hn hnVar;
        String str;
        String a0;
        String str2;
        String a02;
        String a03;
        boolean z;
        int i;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.e = arrayList2;
        int size = arrayList2.size();
        k9 k9Var = this.d;
        if (size == 1) {
            gt4 gt4Var = (gt4) this.e.get(0);
            gt4Var.getClass();
            if (gt4Var.g(ConnectionsManager.getInstance(y6c.t0).getCurrentTime())) {
                k9Var.a(gt4Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var.f;
                if (tL_starGiftAuctionState != null) {
                    i = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i = 0;
                }
                k9Var.a(i);
            }
        } else {
            k9Var.f = 0;
            k9Var.c.b();
            k9Var.a.t(k96.M0(2131750320, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            hnVar = this.b;
            if (i2 >= size2) {
                break;
            }
            gt4 gt4Var2 = (gt4) this.e.get(i2);
            boolean g = gt4Var2.g(currentTime);
            int i3 = size2;
            long j = gt4Var2.c;
            z2 |= g;
            if (j != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new gm(j, hnVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = gt4Var2.d();
            if (d != 2 && d != 3) {
                z = false;
            } else {
                z = true;
            }
            z3 |= z;
            i2++;
            size2 = i3;
        }
        int i4 = size2;
        spannableStringBuilder.append(' ');
        if (z2) {
            if (i4 == 1) {
                str = null;
                a03 = k96.M0(2131750385, null);
            } else {
                str = null;
                a03 = k96.a0(null, null, 2131750384, Integer.valueOf(i4));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            if (i4 == 1) {
                a0 = k96.M0(2131750403, null);
            } else {
                a0 = k96.a0(null, null, 2131750402, Integer.valueOf(i4));
            }
            spannableStringBuilder.append((CharSequence) a0);
        }
        hnVar.c(spannableStringBuilder, true, true);
        this.f = false;
        hn hnVar2 = this.c;
        if (z2) {
            hnVar2.setText(k96.M0(2131750397, str));
        } else if (z3) {
            hnVar2.setText(k96.M0(2131750396, str));
            this.f = true;
        } else if (i4 > 1) {
            hnVar2.setText(k96.M0(2131750392, str));
        } else {
            int i5 = ((gt4) this.e.get(0)).i;
            if (i5 == 1) {
                a02 = k96.M0(2131750395, str);
            } else if (i5 == 2) {
                a02 = k96.M0(2131750394, str);
            } else if (i5 == 3) {
                a02 = k96.M0(2131750393, str);
            } else {
                int i6 = i5 % 100;
                if (i6 >= 11 && i6 <= 13) {
                    str2 = null;
                    a02 = k96.a0(null, null, 2131750386, Integer.valueOf(i5));
                } else {
                    int i7 = i5 % 10;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                str2 = null;
                                a02 = k96.a0(null, null, 2131750386, Integer.valueOf(i5));
                            } else {
                                str2 = null;
                                a02 = k96.a0(null, null, 2131750388, Integer.valueOf(i5));
                            }
                        } else {
                            str2 = null;
                            a02 = k96.a0(null, null, 2131750390, Integer.valueOf(i5));
                        }
                    } else {
                        str2 = null;
                        a02 = k96.a0(null, null, 2131750387, Integer.valueOf(i5));
                    }
                }
                hnVar2.setText(k96.a0(str2, str2, 2131750391, a02));
            }
            str2 = str;
            hnVar2.setText(k96.a0(str2, str2, 2131750391, a02));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        kt4.c(i).f.add(this);
        c(kt4.c(i).c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kt4.c(this.a).f.remove(this);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i;
        this.b.setTextColor(bkb.w0(null, bkb.F6, false));
        if (this.f) {
            i = bkb.p7;
        } else {
            i = bkb.x6;
        }
        this.c.setTextColor(bkb.w0(null, i, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
