package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f16007a;
    public final a f16008b;

    public e(Context context, a aVar) {
        this.f16007a = context;
        this.f16008b = aVar;
    }

    @Override
    public final void finish() {
        this.f16008b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f16008b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f16007a, this.f16008b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f16008b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f16008b.e();
    }

    @Override
    public final Object getTag() {
        return this.f16008b.f15999a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f16008b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f16008b.f16000b;
    }

    @Override
    public final void invalidate() {
        this.f16008b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f16008b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f16008b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f16008b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f16008b.f15999a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f16008b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f16008b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f16008b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f16008b.l(i10);
    }
}
