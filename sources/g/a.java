package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12608a;
    public final b f12609b;

    public a(b bVar, e eVar) {
        this.f12609b = bVar;
        this.f12608a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12609b;
        e eVar = this.f12608a;
        ((DialogInterface.OnClickListener) bVar.f12623m).onClick(eVar.f12649b, i7);
        if (!bVar.f12613a) {
            eVar.f12649b.dismiss();
        }
    }
}
