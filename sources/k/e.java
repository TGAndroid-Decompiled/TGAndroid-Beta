package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f18163a;
    public final a f18164b;

    public e(Context context, a aVar) {
        this.f18163a = context;
        this.f18164b = aVar;
    }

    @Override
    public final void finish() {
        this.f18164b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f18164b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f18163a, this.f18164b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f18164b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f18164b.f();
    }

    @Override
    public final Object getTag() {
        return this.f18164b.f18155b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18164b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f18164b.f18154a;
    }

    @Override
    public final void invalidate() {
        this.f18164b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f18164b.j();
    }

    @Override
    public final void setCustomView(View view) {
        this.f18164b.m(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f18164b.o(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f18164b.f18155b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f18164b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f18164b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f18164b.n(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f18164b.q(i7);
    }
}
