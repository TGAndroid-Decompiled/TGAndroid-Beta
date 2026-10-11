package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14282a;
    public final a f14283b;

    public e(Context context, a aVar) {
        this.f14282a = context;
        this.f14283b = aVar;
    }

    @Override
    public final void finish() {
        this.f14283b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14283b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14282a, this.f14283b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14283b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14283b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14283b.f14273a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14283b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14283b.f14274b;
    }

    @Override
    public final void invalidate() {
        this.f14283b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14283b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14283b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14283b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14283b.f14273a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14283b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14283b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14283b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14283b.l(i10);
    }
}
