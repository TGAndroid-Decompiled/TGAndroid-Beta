package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.s9;
public final class z4 implements s9 {
    public final int f22195a;
    public final Object f22196b;
    public final int f22197c;
    public final int d;

    public z4(Object obj, int i7, int i10, int i11) {
        this.f22195a = i11;
        this.f22196b = obj;
        this.f22197c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f22195a) {
            case 0:
                return (Layout) this.f22196b;
            case 1:
                return (Layout) this.f22196b;
            case 2:
                return (Layout) this.f22196b;
            default:
                return ((s9) this.f22196b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22195a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f22195a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((s9) this.f22196b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22195a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((s9) this.f22196b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22195a) {
            case 0:
                return ((Layout) this.f22196b).getText();
            case 1:
                return ((Layout) this.f22196b).getText();
            case 2:
                return ((Layout) this.f22196b).getText();
            default:
                return ((s9) this.f22196b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f22195a) {
            case 0:
                return this.f22197c;
            case 1:
                return this.f22197c;
            case 2:
                return this.f22197c;
            default:
                return ((s9) this.f22196b).getX() + this.f22197c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22195a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((s9) this.f22196b).getY() + this.d;
        }
    }
}
