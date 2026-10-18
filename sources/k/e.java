package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14528a;
    public final a f14529b;

    public e(Context context, a aVar) {
        this.f14528a = context;
        this.f14529b = aVar;
    }

    @Override
    public final void finish() {
        this.f14529b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14529b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14528a, this.f14529b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14529b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14529b.f();
    }

    @Override
    public final Object getTag() {
        return this.f14529b.f14520a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14529b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14529b.f14521b;
    }

    @Override
    public final void invalidate() {
        this.f14529b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14529b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14529b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14529b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14529b.f14520a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14529b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14529b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14529b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14529b.m(i10);
    }
}
