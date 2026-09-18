package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13114a;
    public final a f13115b;

    public e(Context context, a aVar) {
        this.f13114a = context;
        this.f13115b = aVar;
    }

    @Override
    public final void finish() {
        this.f13115b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13115b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13114a, this.f13115b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13115b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13115b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13115b.f13106a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13115b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13115b.f13107b;
    }

    @Override
    public final void invalidate() {
        this.f13115b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13115b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13115b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13115b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13115b.f13106a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13115b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13115b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13115b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13115b.l(i10);
    }
}
