package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13729a;
    public final a f13730b;

    public e(Context context, a aVar) {
        this.f13729a = context;
        this.f13730b = aVar;
    }

    @Override
    public final void finish() {
        this.f13730b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13730b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13729a, this.f13730b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13730b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13730b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13730b.f13721a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13730b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13730b.f13722b;
    }

    @Override
    public final void invalidate() {
        this.f13730b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13730b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13730b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13730b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13730b.f13721a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13730b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13730b.p(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13730b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13730b.m(i10);
    }
}
