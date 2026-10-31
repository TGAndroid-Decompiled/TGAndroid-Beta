package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f7133a;
    public final b f7134b;

    public a(b bVar, e eVar) {
        this.f7134b = bVar;
        this.f7133a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f7134b;
        e eVar = this.f7133a;
        ((DialogInterface.OnClickListener) bVar.f7146m).onClick(eVar.f7171b, i10);
        if (!bVar.f7137a) {
            eVar.f7171b.dismiss();
        }
    }
}
