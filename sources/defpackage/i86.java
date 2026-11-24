package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class i86 extends bx9 {
    public final byte d;
    public final View e;

    public i86(View view, byte b) {
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
                dx9 dx9Var = ((k86) this.e).h;
                float f = min / 100.0f;
                dx9Var.y.n(true, f);
                dx9Var.setProgress(f);
                return;
            case 1:
                if (((rb8) this.e).s.e8 > 0 && (max = Math.max(0, Math.min(((rb8) this.e).s.e8 - 1, min))) != ((rb8) this.e).s.d8) {
                    rb8 rb8Var = (rb8) this.e;
                    rb8Var.r = rb8Var.s.d8;
                    ((rb8) this.e).s.d8 = max;
                    ((rb8) this.e).s.N();
                    ((rb8) this.e).invalidate();
                    int i2 = ((rb8) this.e).s.d8;
                    rb8 rb8Var2 = (rb8) this.e;
                    if (i2 != rb8Var2.r) {
                        rb8Var2.s.x1(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((hla) this.e).setOption(min);
                return;
        }
    }

    @Override
    public final CharSequence d() {
        switch (this.d) {
            case 1:
                StringBuilder sb = new StringBuilder(jb6.M0(2131754734, "AccDescrVideoQuality"));
                if (((rb8) this.e).s.e8 > 0) {
                    sb.append(", ");
                    sb.append(((rb8) this.e).s.d8 + 1);
                    sb.append(" / ");
                    sb.append(((rb8) this.e).s.e8);
                }
                sb.append(", ");
                sb.append(((rb8) this.e).h);
                sb.append(" – ");
                sb.append(((rb8) this.e).n);
                return sb.toString();
            case 2:
                hla hlaVar = (hla) this.e;
                int i = hlaVar.J;
                String[] strArr = hlaVar.G;
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
                return Math.max(0, ((rb8) this.e).s.e8 - 1);
            default:
                return ((hla) this.e).G.length - 1;
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return e86.c();
            case 1:
                return ((rb8) this.e).s.d8;
            default:
                return ((hla) this.e).J;
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(jb6.M0(2131748625, null));
                sb.append(", ");
                int c = e86.c();
                if (c <= 0) {
                    sb.append(jb6.M0(2131748633, null));
                } else if (c >= 100) {
                    sb.append(jb6.M0(2131748632, null));
                } else {
                    sb.append(jb6.a0(null, null, 2131754848, Integer.valueOf(Math.round(c))));
                }
                accessibilityEvent.setContentDescription(sb);
                ((k86) this.e).setContentDescription(sb);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}
