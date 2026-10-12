package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14280a;
    public final a f14281b;

    public e(Context context, a aVar) {
        this.f14280a = context;
        this.f14281b = aVar;
    }

    @Override
    public final void finish() {
        this.f14281b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14281b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14280a, this.f14281b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14281b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14281b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14281b.f14271a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14281b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14281b.f14272b;
    }

    @Override
    public final void invalidate() {
        this.f14281b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14281b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14281b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14281b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14281b.f14271a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14281b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14281b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14281b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14281b.l(i10);
    }
}
