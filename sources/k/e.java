package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14523a;
    public final a f14524b;

    public e(Context context, a aVar) {
        this.f14523a = context;
        this.f14524b = aVar;
    }

    @Override
    public final void finish() {
        this.f14524b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14524b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14523a, this.f14524b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14524b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14524b.f();
    }

    @Override
    public final Object getTag() {
        return this.f14524b.f14515a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14524b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14524b.f14516b;
    }

    @Override
    public final void invalidate() {
        this.f14524b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14524b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14524b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14524b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14524b.f14515a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14524b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14524b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14524b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14524b.m(i10);
    }
}
