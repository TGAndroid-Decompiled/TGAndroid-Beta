package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f11957a;
    public final a f11958b;

    public e(Context context, a aVar) {
        this.f11957a = context;
        this.f11958b = aVar;
    }

    @Override
    public final void finish() {
        this.f11958b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f11958b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f11957a, this.f11958b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f11958b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f11958b.e();
    }

    @Override
    public final Object getTag() {
        return this.f11958b.f11949a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11958b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f11958b.f11950b;
    }

    @Override
    public final void invalidate() {
        this.f11958b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f11958b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f11958b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f11958b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f11958b.f11949a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f11958b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f11958b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f11958b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f11958b.l(i10);
    }
}
