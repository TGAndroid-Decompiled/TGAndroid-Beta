package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
public final class b5 implements t9 {
    public final int f22091a;
    public final Object f22092b;
    public final int f22093c;
    public final int d;

    public b5(Object obj, int i7, int i10, int i11) {
        this.f22091a = i11;
        this.f22092b = obj;
        this.f22093c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f22091a) {
            case 0:
                return (Layout) this.f22092b;
            case 1:
                return (Layout) this.f22092b;
            case 2:
                return (Layout) this.f22092b;
            default:
                return ((t9) this.f22092b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f22091a) {
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
        switch (this.f22091a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((t9) this.f22092b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f22091a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((t9) this.f22092b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f22091a) {
            case 0:
                return ((Layout) this.f22092b).getText();
            case 1:
                return ((Layout) this.f22092b).getText();
            case 2:
                return ((Layout) this.f22092b).getText();
            default:
                return ((t9) this.f22092b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f22091a) {
            case 0:
                return this.f22093c;
            case 1:
                return this.f22093c;
            case 2:
                return this.f22093c;
            default:
                return ((t9) this.f22092b).getX() + this.f22093c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f22091a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((t9) this.f22092b).getY() + this.d;
        }
    }
}
