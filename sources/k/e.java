package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14283a;
    public final a f14284b;

    public e(Context context, a aVar) {
        this.f14283a = context;
        this.f14284b = aVar;
    }

    @Override
    public final void finish() {
        this.f14284b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14284b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14283a, this.f14284b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14284b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14284b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14284b.f14274a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14284b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14284b.f14275b;
    }

    @Override
    public final void invalidate() {
        this.f14284b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14284b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14284b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14284b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14284b.f14274a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14284b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14284b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14284b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14284b.l(i10);
    }
}
