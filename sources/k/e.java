package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f14417a;
    public final a f14418b;

    public e(Context context, a aVar) {
        this.f14417a = context;
        this.f14418b = aVar;
    }

    @Override
    public final void finish() {
        this.f14418b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14418b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f14417a, this.f14418b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14418b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14418b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14418b.f14408a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14418b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14418b.f14409b;
    }

    @Override
    public final void invalidate() {
        this.f14418b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14418b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14418b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14418b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14418b.f14408a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14418b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14418b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14418b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14418b.l(i10);
    }
}
