package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
public final class pfb extends ActionMode {
    public final Context a;
    public final g9 b;

    public pfb(Context context, g9 g9Var) {
        this.a = context;
        this.b = g9Var;
    }

    @Override
    public final void finish() {
        this.b.b();
    }

    @Override
    public final View getCustomView() {
        return this.b.c();
    }

    @Override
    public final Menu getMenu() {
        return new d37(this.a, this.b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.b.f();
    }

    @Override
    public final Object getTag() {
        return this.b.b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.b.a;
    }

    @Override
    public final void invalidate() {
        this.b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.b.l(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.b.b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.b.p(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z) {
        this.b.q(z);
    }

    @Override
    public final void setSubtitle(int i) {
        this.b.m(i);
    }

    @Override
    public final void setTitle(int i) {
        this.b.o(i);
    }
}
