package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14398a;
    public final a f14399b;

    public e(Context context, a aVar) {
        this.f14398a = context;
        this.f14399b = aVar;
    }

    @Override
    public final void finish() {
        this.f14399b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14399b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14398a, this.f14399b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14399b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14399b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14399b.f14389a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14399b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14399b.f14390b;
    }

    @Override
    public final void invalidate() {
        this.f14399b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14399b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14399b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14399b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14399b.f14389a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14399b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14399b.o(z10);
    }

    @Override
    public final void setSubtitle(int i9) {
        this.f14399b.j(i9);
    }

    @Override
    public final void setTitle(int i9) {
        this.f14399b.m(i9);
    }
}
