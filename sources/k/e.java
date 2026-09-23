package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13103a;
    public final a f13104b;

    public e(Context context, a aVar) {
        this.f13103a = context;
        this.f13104b = aVar;
    }

    @Override
    public final void finish() {
        this.f13104b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13104b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13103a, this.f13104b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13104b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13104b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13104b.f13095a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13104b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13104b.f13096b;
    }

    @Override
    public final void invalidate() {
        this.f13104b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13104b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13104b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13104b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13104b.f13095a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13104b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13104b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13104b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13104b.l(i10);
    }
}
