package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14246a;
    public final a f14247b;

    public e(Context context, a aVar) {
        this.f14246a = context;
        this.f14247b = aVar;
    }

    @Override
    public final void finish() {
        this.f14247b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14247b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14246a, this.f14247b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14247b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14247b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14247b.f14237a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14247b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14247b.f14238b;
    }

    @Override
    public final void invalidate() {
        this.f14247b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14247b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14247b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14247b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14247b.f14237a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14247b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14247b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14247b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14247b.l(i10);
    }
}
