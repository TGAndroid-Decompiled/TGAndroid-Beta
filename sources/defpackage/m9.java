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
public final class m9 extends FrameLayout implements mv4, snb {
    public final int a;
    public final in b;
    public final in c;
    public final l9 d;
    public ArrayList e;
    public boolean f;

    public m9(Activity activity, int i) {
        super(activity);
        this.e = new ArrayList();
        this.a = i;
        LinearLayout m = bs2.m(activity, 1);
        in inVar = new in(activity, false, false, false);
        this.b = inVar;
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        inVar.setTranslationY(-hl.L(1.0f));
        m.addView(inVar, tre.o(-1, 18));
        in inVar2 = new in(activity, false, false, false);
        this.c = inVar2;
        inVar2.setTextSize(hl.L(13.0f));
        m.addView(inVar2, tre.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l9 l9Var = new l9(activity, i);
        this.d = l9Var;
        l9Var.b(299L);
        addView(m, tre.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(l9Var, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable L0 = aob.L0(false);
        uob M = yob.M(aob.i6);
        setBackground(L0);
        yob.j(this, L0, null, M, null);
        updateColors();
        setOnClickListener(new k1(this, (byte) 4));
    }

    @Override
    public final void c(ArrayList arrayList) {
        in inVar;
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
        l9 l9Var = this.d;
        if (size == 1) {
            kv4 kv4Var = (kv4) this.e.get(0);
            kv4Var.getClass();
            if (kv4Var.g(ConnectionsManager.getInstance(yac.t0).getCurrentTime())) {
                l9Var.a(kv4Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var.f;
                if (tL_starGiftAuctionState != null) {
                    i = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i = 0;
                }
                l9Var.a(i);
            }
        } else {
            l9Var.f = 0;
            l9Var.c.b();
            l9Var.a.t(ob6.M0(2131750297, null), true, true);
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
            inVar = this.b;
            if (i2 >= size2) {
                break;
            }
            kv4 kv4Var2 = (kv4) this.e.get(i2);
            boolean g = kv4Var2.g(currentTime);
            int i3 = size2;
            long j = kv4Var2.c;
            z2 |= g;
            if (j != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new hm(j, inVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = kv4Var2.d();
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
                a03 = ob6.M0(2131750362, null);
            } else {
                str = null;
                a03 = ob6.a0(null, null, 2131750361, Integer.valueOf(i4));
            }
            spannableStringBuilder.append((CharSequence) a03);
        } else {
            str = null;
            if (i4 == 1) {
                a0 = ob6.M0(2131750380, null);
            } else {
                a0 = ob6.a0(null, null, 2131750379, Integer.valueOf(i4));
            }
            spannableStringBuilder.append((CharSequence) a0);
        }
        inVar.c(spannableStringBuilder, true, true);
        this.f = false;
        in inVar2 = this.c;
        if (z2) {
            inVar2.setText(ob6.M0(2131750374, str));
        } else if (z3) {
            inVar2.setText(ob6.M0(2131750373, str));
            this.f = true;
        } else if (i4 > 1) {
            inVar2.setText(ob6.M0(2131750369, str));
        } else {
            int i5 = ((kv4) this.e.get(0)).i;
            if (i5 == 1) {
                a02 = ob6.M0(2131750372, str);
            } else if (i5 == 2) {
                a02 = ob6.M0(2131750371, str);
            } else if (i5 == 3) {
                a02 = ob6.M0(2131750370, str);
            } else {
                int i6 = i5 % 100;
                if (i6 >= 11 && i6 <= 13) {
                    str2 = null;
                    a02 = ob6.a0(null, null, 2131750363, Integer.valueOf(i5));
                } else {
                    int i7 = i5 % 10;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                str2 = null;
                                a02 = ob6.a0(null, null, 2131750363, Integer.valueOf(i5));
                            } else {
                                str2 = null;
                                a02 = ob6.a0(null, null, 2131750365, Integer.valueOf(i5));
                            }
                        } else {
                            str2 = null;
                            a02 = ob6.a0(null, null, 2131750367, Integer.valueOf(i5));
                        }
                    } else {
                        str2 = null;
                        a02 = ob6.a0(null, null, 2131750364, Integer.valueOf(i5));
                    }
                }
                inVar2.setText(ob6.a0(str2, str2, 2131750368, a02));
            }
            str2 = str;
            inVar2.setText(ob6.a0(str2, str2, 2131750368, a02));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        ov4.c(i).f.add(this);
        c(ov4.c(i).c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ov4.c(this.a).f.remove(this);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i;
        this.b.setTextColor(aob.w0(null, aob.G6, false));
        if (this.f) {
            i = aob.q7;
        } else {
            i = aob.y6;
        }
        this.c.setTextColor(aob.w0(null, i, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
