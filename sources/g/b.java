package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final e f6232a;
    public final c f6233b;

    public b(c cVar, e eVar) {
        this.f6233b = cVar;
        this.f6232a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        c cVar = this.f6233b;
        DialogInterface.OnClickListener onClickListener = cVar.f6240j;
        e eVar = this.f6232a;
        onClickListener.onClick(eVar.f6245b, i10);
        if (!cVar.f6242l) {
            eVar.f6245b.dismiss();
        }
    }
}
