package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;

public final class e extends ActionMode {

    public final Context f14215a;

    public final a f14216b;

    public e(Context context, a aVar) {
        this.f14215a = context;
        this.f14216b = aVar;
    }

    @Override
    public final void finish() {
        this.f14216b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14216b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f14215a, this.f14216b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14216b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14216b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14216b.f14206a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14216b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14216b.f14207b;
    }

    @Override
    public final void invalidate() {
        this.f14216b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14216b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14216b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14216b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14216b.f14206a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14216b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14216b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14216b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14216b.m(i10);
    }
}
