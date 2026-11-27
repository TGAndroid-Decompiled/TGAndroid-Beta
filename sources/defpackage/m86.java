package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m86 extends sy9 {
    public final byte d;
    public final View e;

    public m86(View view, byte b) {
        this.d = b;
        this.e = view;
    }

    @Override
    public final boolean a() {
        if (i() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (i() < h()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z) {
        int i;
        int max;
        switch (this.d) {
            case 0:
                i = 5;
                break;
            default:
                i = 1;
                break;
        }
        if (z) {
            i *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i));
        switch (this.d) {
            case 0:
                uy9 uy9Var = ((o86) this.e).h;
                float f = min / 100.0f;
                uy9Var.y.o(true, f);
                uy9Var.setProgress(f);
                return;
            case 1:
                if (((gd8) this.e).s.e8 > 0 && (max = Math.max(0, Math.min(((gd8) this.e).s.e8 - 1, min))) != ((gd8) this.e).s.d8) {
                    gd8 gd8Var = (gd8) this.e;
                    gd8Var.r = gd8Var.s.d8;
                    ((gd8) this.e).s.d8 = max;
                    ((gd8) this.e).s.N();
                    ((gd8) this.e).invalidate();
                    int i2 = ((gd8) this.e).s.d8;
                    gd8 gd8Var2 = (gd8) this.e;
                    if (i2 != gd8Var2.r) {
                        gd8Var2.s.x1(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((zma) this.e).setOption(min);
                return;
        }
    }

    @Override
    public final CharSequence d() {
        switch (this.d) {
            case 1:
                StringBuilder sb = new StringBuilder(ob6.M0(2131754730, "AccDescrVideoQuality"));
                if (((gd8) this.e).s.e8 > 0) {
                    sb.append(", ");
                    sb.append(((gd8) this.e).s.d8 + 1);
                    sb.append(" / ");
                    sb.append(((gd8) this.e).s.e8);
                }
                sb.append(", ");
                sb.append(((gd8) this.e).h);
                sb.append(" – ");
                sb.append(((gd8) this.e).n);
                return sb.toString();
            case 2:
                zma zmaVar = (zma) this.e;
                int i = zmaVar.J;
                String[] strArr = zmaVar.G;
                if (i < strArr.length) {
                    return strArr[i];
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.d) {
            case 0:
                super.e(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setEnabled(true);
                return;
            default:
                super.e(view, accessibilityNodeInfo);
                return;
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                return 100;
            case 1:
                return Math.max(0, ((gd8) this.e).s.e8 - 1);
            default:
                return ((zma) this.e).G.length - 1;
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return i86.c();
            case 1:
                return ((gd8) this.e).s.d8;
            default:
                return ((zma) this.e).J;
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(ob6.M0(2131748622, null));
                sb.append(", ");
                int c = i86.c();
                if (c <= 0) {
                    sb.append(ob6.M0(2131748630, null));
                } else if (c >= 100) {
                    sb.append(ob6.M0(2131748629, null));
                } else {
                    sb.append(ob6.a0(null, null, 2131754844, Integer.valueOf(Math.round(c))));
                }
                accessibilityEvent.setContentDescription(sb);
                ((o86) this.e).setContentDescription(sb);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}
