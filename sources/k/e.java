package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14281a;
    public final a f14282b;

    public e(Context context, a aVar) {
        this.f14281a = context;
        this.f14282b = aVar;
    }

    @Override
    public final void finish() {
        this.f14282b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14282b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14281a, this.f14282b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14282b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14282b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14282b.f14272a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14282b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14282b.f14273b;
    }

    @Override
    public final void invalidate() {
        this.f14282b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14282b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14282b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14282b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14282b.f14272a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14282b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14282b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14282b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14282b.l(i10);
    }
}
