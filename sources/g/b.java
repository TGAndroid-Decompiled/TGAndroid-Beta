package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9204a;
    public final c f9205b;

    public b(c cVar, f fVar) {
        this.f9205b = cVar;
        this.f9204a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9205b;
        DialogInterface.OnClickListener onClickListener = cVar.f9233j;
        f fVar = this.f9204a;
        onClickListener.onClick(fVar.f9240b, i10);
        if (!cVar.f9235l) {
            fVar.f9240b.dismiss();
        }
    }
}
