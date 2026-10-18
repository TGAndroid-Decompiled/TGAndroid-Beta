package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14530a;
    public final a f14531b;

    public e(Context context, a aVar) {
        this.f14530a = context;
        this.f14531b = aVar;
    }

    @Override
    public final void finish() {
        this.f14531b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14531b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14530a, this.f14531b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14531b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14531b.f();
    }

    @Override
    public final Object getTag() {
        return this.f14531b.f14522a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14531b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14531b.f14523b;
    }

    @Override
    public final void invalidate() {
        this.f14531b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14531b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14531b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14531b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14531b.f14522a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14531b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14531b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14531b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14531b.m(i10);
    }
}
