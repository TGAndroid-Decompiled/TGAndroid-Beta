package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
public final class m4d extends Fragment implements c16 {
    public static final WeakHashMap b = new WeakHashMap();
    public final ab8 a = new ab8();

    @Override
    public final void a(String str, y06 y06Var) {
        this.a.a(str, y06Var);
    }

    @Override
    public final y06 b(Class cls, String str) {
        return (y06) cls.cast(((Map) this.a.b).get(str));
    }

    @Override
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (y06 y06Var : ((Map) this.a.b).values()) {
            y06Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final Activity e() {
        return getActivity();
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (y06 y06Var : ((Map) this.a.b).values()) {
            y06Var.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 5;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onDestroy();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 3;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onResume();
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override
    public final void onStart() {
        super.onStart();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 2;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onStart();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        ab8 ab8Var = this.a;
        ab8Var.a = (byte) 4;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onStop();
        }
    }
}
