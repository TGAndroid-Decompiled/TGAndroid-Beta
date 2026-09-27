package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9192a;
    public final c f9193b;

    public b(c cVar, f fVar) {
        this.f9193b = cVar;
        this.f9192a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9193b;
        DialogInterface.OnClickListener onClickListener = cVar.f9221j;
        f fVar = this.f9192a;
        onClickListener.onClick(fVar.f9228b, i10);
        if (!cVar.f9223l) {
            fVar.f9228b.dismiss();
        }
    }
}
