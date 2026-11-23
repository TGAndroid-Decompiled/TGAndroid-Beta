package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f18061a;
    public final a f18062b;

    public e(Context context, a aVar) {
        this.f18061a = context;
        this.f18062b = aVar;
    }

    @Override
    public final void finish() {
        this.f18062b.c();
    }

    @Override
    public final View getCustomView() {
        return this.f18062b.d();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f18061a, this.f18062b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f18062b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f18062b.g();
    }

    @Override
    public final Object getTag() {
        return this.f18062b.f18053b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18062b.i();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f18062b.f18052a;
    }

    @Override
    public final void invalidate() {
        this.f18062b.j();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f18062b.k();
    }

    @Override
    public final void setCustomView(View view) {
        this.f18062b.n(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f18062b.p(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f18062b.f18053b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f18062b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f18062b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f18062b.o(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f18062b.q(i7);
    }
}
