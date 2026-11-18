package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f18064a;
    public final a f18065b;

    public e(Context context, a aVar) {
        this.f18064a = context;
        this.f18065b = aVar;
    }

    @Override
    public final void finish() {
        this.f18065b.c();
    }

    @Override
    public final View getCustomView() {
        return this.f18065b.d();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f18064a, this.f18065b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f18065b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f18065b.g();
    }

    @Override
    public final Object getTag() {
        return this.f18065b.f18056b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18065b.i();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f18065b.f18055a;
    }

    @Override
    public final void invalidate() {
        this.f18065b.j();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f18065b.k();
    }

    @Override
    public final void setCustomView(View view) {
        this.f18065b.n(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f18065b.p(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f18065b.f18056b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f18065b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f18065b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f18065b.o(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f18065b.q(i7);
    }
}
