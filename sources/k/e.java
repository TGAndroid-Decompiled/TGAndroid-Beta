package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f18067a;
    public final a f18068b;

    public e(Context context, a aVar) {
        this.f18067a = context;
        this.f18068b = aVar;
    }

    @Override
    public final void finish() {
        this.f18068b.c();
    }

    @Override
    public final View getCustomView() {
        return this.f18068b.d();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f18067a, this.f18068b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f18068b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f18068b.g();
    }

    @Override
    public final Object getTag() {
        return this.f18068b.f18059b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18068b.i();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f18068b.f18058a;
    }

    @Override
    public final void invalidate() {
        this.f18068b.j();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f18068b.k();
    }

    @Override
    public final void setCustomView(View view) {
        this.f18068b.n(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f18068b.p(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f18068b.f18059b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f18068b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f18068b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f18068b.o(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f18068b.q(i7);
    }
}
