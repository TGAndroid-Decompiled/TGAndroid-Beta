package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f18095a;
    public final a f18096b;

    public e(Context context, a aVar) {
        this.f18095a = context;
        this.f18096b = aVar;
    }

    @Override
    public final void finish() {
        this.f18096b.c();
    }

    @Override
    public final View getCustomView() {
        return this.f18096b.d();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f18095a, this.f18096b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f18096b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f18096b.g();
    }

    @Override
    public final Object getTag() {
        return this.f18096b.f18087b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18096b.i();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f18096b.f18086a;
    }

    @Override
    public final void invalidate() {
        this.f18096b.j();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f18096b.k();
    }

    @Override
    public final void setCustomView(View view) {
        this.f18096b.n(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f18096b.p(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f18096b.f18087b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f18096b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f18096b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f18096b.o(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f18096b.q(i7);
    }
}
