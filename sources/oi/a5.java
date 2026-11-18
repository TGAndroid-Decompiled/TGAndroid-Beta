package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
public final class a5 implements t9 {
    public final int f21936a;
    public final Object f21937b;
    public final int f21938c;
    public final int d;

    public a5(Object obj, int i7, int i10, int i11) {
        this.f21936a = i11;
        this.f21937b = obj;
        this.f21938c = i7;
        this.d = i10;
    }

    @Override
    public final Layout a() {
        switch (this.f21936a) {
            case 0:
                return (Layout) this.f21937b;
            case 1:
                return (Layout) this.f21937b;
            case 2:
                return (Layout) this.f21937b;
            default:
                return ((t9) this.f21937b).a();
        }
    }

    @Override
    public final Rect c() {
        switch (this.f21936a) {
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
        switch (this.f21936a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((t9) this.f21937b).getPrefix();
        }
    }

    @Override
    public final int getRow() {
        switch (this.f21936a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((t9) this.f21937b).getRow();
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f21936a) {
            case 0:
                return ((Layout) this.f21937b).getText();
            case 1:
                return ((Layout) this.f21937b).getText();
            case 2:
                return ((Layout) this.f21937b).getText();
            default:
                return ((t9) this.f21937b).getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f21936a) {
            case 0:
                return this.f21938c;
            case 1:
                return this.f21938c;
            case 2:
                return this.f21938c;
            default:
                return ((t9) this.f21937b).getX() + this.f21938c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f21936a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((t9) this.f21937b).getY() + this.d;
        }
    }
}
