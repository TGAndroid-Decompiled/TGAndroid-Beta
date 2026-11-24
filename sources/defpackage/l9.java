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
public final class l9 extends FrameLayout implements jv4, vlb {
    public final int a;
    public final io b;
    public final io c;
    public final k9 d;
    public ArrayList e;
    public boolean f;

    public l9(Activity activity, int i) {
        super(activity);
        this.e = new ArrayList();
        this.a = i;
        LinearLayout l = td4.l(activity, 1);
        io ioVar = new io(activity, false, false, false);
        this.b = ioVar;
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.o());
        ioVar.setTranslationY(-gm.L(1.0f));
        l.addView(ioVar, qoe.o(-1, 18));
        io ioVar2 = new io(activity, false, false, false);
        this.c = ioVar2;
        ioVar2.setTextSize(gm.L(13.0f));
        l.addView(ioVar2, qoe.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        k9 k9Var = new k9(activity, i);
        this.d = k9Var;
        k9Var.b(299L);
        addView(l, qoe.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(k9Var, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable L0 = cmb.L0(false);
        wmb M = anb.M(cmb.h6);
        setBackground(L0);
        anb.j(this, L0, null, M, null);
        updateColors();
        setOnClickListener(new j1(this, (byte) 4));
    }

    @Override
    public final void c(ArrayList arrayList) {
        io ioVar;
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
            hv4 hv4Var = (hv4) this.e.get(0);
            hv4Var.getClass();
            if (hv4Var.g(ConnectionsManager.getInstance(z8c.t0).getCurrentTime())) {
                k9Var.a(hv4Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var.f;
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
            k9Var.a.t(jb6.M0(2131750269, null), true, true);
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
            ioVar = this.b;
            if (i2 >= size2) {
                break;
            }
            hv4 hv4Var2 = (hv4) this.e.get(i2);
            boolean g = hv4Var2.g(currentTime);
            int i3 = size2;
            long j = hv4Var2.c;
            z2 |= g;
            if (j != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new gn(j, ioVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = hv4Var2.d();
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
                a03 = jb6.M0(2131750334, null);
            } else {
                str = null;
                a03 = jb6.a0(null, null, 2131750333, Integer.valueOf(i4));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            if (i4 == 1) {
                a0 = jb6.M0(2131750352, null);
            } else {
                a0 = jb6.a0(null, null, 2131750351, Integer.valueOf(i4));
            }
            spannableStringBuilder.append((CharSequence) a0);
        }
        ioVar.c(spannableStringBuilder, true, true);
        this.f = false;
        io ioVar2 = this.c;
        if (z2) {
            ioVar2.setText(jb6.M0(2131750346, str));
        } else if (z3) {
            ioVar2.setText(jb6.M0(2131750345, str));
            this.f = true;
        } else if (i4 > 1) {
            ioVar2.setText(jb6.M0(2131750341, str));
        } else {
            int i5 = ((hv4) this.e.get(0)).i;
            if (i5 == 1) {
                a02 = jb6.M0(2131750344, str);
            } else if (i5 == 2) {
                a02 = jb6.M0(2131750343, str);
            } else if (i5 == 3) {
                a02 = jb6.M0(2131750342, str);
            } else {
                int i6 = i5 % 100;
                if (i6 >= 11 && i6 <= 13) {
                    str2 = null;
                    a02 = jb6.a0(null, null, 2131750335, Integer.valueOf(i5));
                } else {
                    int i7 = i5 % 10;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                str2 = null;
                                a02 = jb6.a0(null, null, 2131750335, Integer.valueOf(i5));
                            } else {
                                str2 = null;
                                a02 = jb6.a0(null, null, 2131750337, Integer.valueOf(i5));
                            }
                        } else {
                            str2 = null;
                            a02 = jb6.a0(null, null, 2131750339, Integer.valueOf(i5));
                        }
                    } else {
                        str2 = null;
                        a02 = jb6.a0(null, null, 2131750336, Integer.valueOf(i5));
                    }
                }
                ioVar2.setText(jb6.a0(str2, str2, 2131750340, a02));
            }
            str2 = str;
            ioVar2.setText(jb6.a0(str2, str2, 2131750340, a02));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        lv4.c(i).f.add(this);
        c(lv4.c(i).c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lv4.c(this.a).f.remove(this);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i;
        this.b.setTextColor(cmb.w0(null, cmb.F6, false));
        if (this.f) {
            i = cmb.p7;
        } else {
            i = cmb.x6;
        }
        this.c.setTextColor(cmb.w0(null, i, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
