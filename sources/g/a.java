package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12082a;
    public final b f12083b;

    public a(b bVar, e eVar) {
        this.f12083b = bVar;
        this.f12082a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f12083b;
        DialogInterface.OnClickListener onClickListener = bVar.f12111j;
        e eVar = this.f12082a;
        onClickListener.onClick(eVar.f12118b, i10);
        if (!bVar.f12113l) {
            eVar.f12118b.dismiss();
        }
    }
}
