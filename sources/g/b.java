package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f10003a;
    public final c f10004b;

    public b(c cVar, f fVar) {
        this.f10004b = cVar;
        this.f10003a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f10004b;
        DialogInterface.OnClickListener onClickListener = cVar.f10034j;
        f fVar = this.f10003a;
        onClickListener.onClick(fVar.f10041b, i10);
        if (!cVar.f10036l) {
            fVar.f10041b.dismiss();
        }
    }
}
