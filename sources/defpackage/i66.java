package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class i66 extends yu9 {
    public final byte d;
    public final View e;

    public i66(View view, byte b) {
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
                av9 av9Var = ((k66) this.e).h;
                float f = min / 100.0f;
                av9Var.y.j(true, f);
                av9Var.setProgress(f);
                return;
            case 1:
                if (((q98) this.e).s.f8 > 0 && (max = Math.max(0, Math.min(((q98) this.e).s.f8 - 1, min))) != ((q98) this.e).s.e8) {
                    q98 q98Var = (q98) this.e;
                    q98Var.r = q98Var.s.e8;
                    ((q98) this.e).s.e8 = max;
                    ((q98) this.e).s.O();
                    ((q98) this.e).invalidate();
                    int i2 = ((q98) this.e).s.e8;
                    q98 q98Var2 = (q98) this.e;
                    if (i2 != q98Var2.r) {
                        q98Var2.s.w1(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((fja) this.e).setOption(min);
                return;
        }
    }

    @Override
    public final CharSequence d() {
        switch (this.d) {
            case 1:
                StringBuilder sb = new StringBuilder(k96.M0(2131754734, "AccDescrVideoQuality"));
                if (((q98) this.e).s.f8 > 0) {
                    sb.append(", ");
                    sb.append(((q98) this.e).s.e8 + 1);
                    sb.append(" / ");
                    sb.append(((q98) this.e).s.f8);
                }
                sb.append(", ");
                sb.append(((q98) this.e).h);
                sb.append(" – ");
                sb.append(((q98) this.e).n);
                return sb.toString();
            case 2:
                fja fjaVar = (fja) this.e;
                int i = fjaVar.J;
                String[] strArr = fjaVar.G;
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
                return Math.max(0, ((q98) this.e).s.f8 - 1);
            default:
                return ((fja) this.e).G.length - 1;
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return e66.c();
            case 1:
                return ((q98) this.e).s.e8;
            default:
                return ((fja) this.e).J;
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(k96.M0(2131748676, null));
                sb.append(", ");
                int c = e66.c();
                if (c <= 0) {
                    sb.append(k96.M0(2131748684, null));
                } else if (c >= 100) {
                    sb.append(k96.M0(2131748683, null));
                } else {
                    sb.append(k96.a0(null, null, 2131754848, Integer.valueOf(Math.round(c))));
                }
                accessibilityEvent.setContentDescription(sb);
                ((k66) this.e).setContentDescription(sb);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}
